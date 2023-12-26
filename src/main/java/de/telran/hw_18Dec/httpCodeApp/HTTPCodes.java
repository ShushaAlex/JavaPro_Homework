package de.telran.hw_18Dec.httpCodeApp;

import java.util.function.BiConsumer;

public enum HTTPCodes {
    INFORMATION(100, 199,
            ((code, codes) -> System.out.println(code + " - this code means " + codes))), // 100 - 199
    SUCCESS(200, 299,
            ((code, codes) -> System.out.println(code + " - this code means " + codes))), // 200 - 299
    REDIRECTION(300, 399,
            ((code, codes) -> System.out.println(code + " - this code means " + codes))), // 300 - 399
    CLIENT_ERROR(400, 499,
            ((code, codes) -> System.out.println(code + " - this code means " + codes))), // 400 - 499
    SERVER_ERROR(500, 599,
            ((code, codes) -> System.out.println(code + " - this code means " + codes))); // 500 - 599

    int minCode;
    int maxCode;
    BiConsumer<Integer, HTTPCodes> valAction;

    HTTPCodes(int minCode, int maxCode, BiConsumer<Integer, HTTPCodes> action) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.valAction = action;
    }

    public static void findValueByCode(int code) {
        for (HTTPCodes v: HTTPCodes.values()) {
            if(code >=v.minCode && code<=v.maxCode) {
                v.valAction.accept(code, v);
                break;
            }
        }
    }

}