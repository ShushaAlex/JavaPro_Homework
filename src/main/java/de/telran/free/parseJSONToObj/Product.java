package de.telran.free.parseJSONToObj;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class Product {
    private int id;
    private Category category;
    private String name;
    private String factory;
    private int quantity;
    private boolean isPacked;
    private boolean isAdv;
    private double price;
    private double margin;
    private boolean isDebt;
}
