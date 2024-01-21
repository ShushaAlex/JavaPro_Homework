package de.telran.free.parseJSONToObj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {
    public static void main(String[] args) throws IOException {
        List<String> fileContent = getFileContent("/Users/alex/IdeaProjects/JavaPro_Homework/src/main/java/de/telran/free/parseJSONToObj/report.json");
        System.out.println(getProducts(fileContent));
    }

    public static List<String> getFileContent(String path) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        strings.removeFirst();
        strings.removeLast();
        return strings;
    }

    public static List<Product> getProducts(List<String> Lines) {
        List<Product> products = new ArrayList<>();
        String regex = "(?:CATEGORY\\\":\\s\\\")([A-Z]+)(?:#)(\\d+)(?:\\\",\\\"NAME\\\":\\s\\\")([\\w\\s-]+)" +
                "(?:#[\\d]+\\\",\\\"FACTORY\\\":\\s\\\")([\\w\\s-]+)(?:#\\d+\\\",\\\"QUANTITY\\\":\\s)(\\d+)" +
                "(?:,\\\"ISPACKED\\\":\\s)([a-z]+)(?:,\\\"ISADV\\\":\\s)([a-z]+)(?:,\\\"PRICE\\\":\\s)(\\d+\\.\\d{1,2})" +
                "(?:,\\\"MARGIN\\\":\\s)(\\d+\\.\\d{1,2})(?:,\\\"ISDEBT\\\":\\s)([a-z]+)";
        Pattern pattern = Pattern.compile(regex);
        for (String line : Lines) {
            Product product = new Product();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                product.setCategory(Category.valueOf(matcher.group(1)));
                product.setId(Integer.parseInt(matcher.group(2)));
                product.setName(matcher.group(3));
                product.setFactory(matcher.group(4));
                product.setQuantity(Integer.parseInt(matcher.group(5)));
                product.setPacked(matcher.group(6).equals("true"));
                product.setAdv(matcher.group(7).equals("true"));
                product.setPrice(Double.parseDouble(matcher.group(8)));
                product.setMargin(Double.parseDouble(matcher.group(9)));
                product.setDebt(matcher.group(10).equals("true"));
            }
            products.add(product);
        }
        return products;
    }
}
