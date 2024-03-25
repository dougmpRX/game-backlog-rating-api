package com.dmpweb.gamebacklogratingapi.enums;

import lombok.Getter;

@Getter
public enum BrandEnum {
    MICROSOFT (1, "Microsoft"),
    NINTENDO (2, "Nintendo"),
    SEGA (3, "Sega"),
    SONY (4, "Sony"),
    STEAM (5, "Steam"),
    OTHER (6, "Other");

    private Integer value;
    private String description;

    private BrandEnum(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public static String getDescription(int value) {
        for (BrandEnum brand : BrandEnum.values()) {
            if (brand.getValue().equals(value)) {
                return brand.getDescription();
            }
        }
        throw new IllegalArgumentException("Invalid brand value: " + value);
    }
}
