package com.example.gelateria.entity;

public enum IceCreamTaste {
    CHOCOLATE("CHOCOLATE"),

    STRAWBERRY("STRAWBERRY"),

    LEMON("LEMON"),

    CREAM("CREAM");

    private final String tasteCode;

    IceCreamTaste(String tasteCode) {
        this.tasteCode = tasteCode;
    }

    public String getTasteCode() {
        return tasteCode;
    }

    public static IceCreamTaste valueFromCode(String code) {
        for (IceCreamTaste taste : values()) {
            if (taste.getTasteCode().equals(code))
                return taste;
        }
        throw new IllegalArgumentException("Taste code not valid: " + code);
    }
}