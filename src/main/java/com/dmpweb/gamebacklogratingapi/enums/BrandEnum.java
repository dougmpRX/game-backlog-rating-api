package com.dmpweb.gamebacklogratingapi.enums;

public enum BrandEnum {
    MICROSOFT,
    NINTENDO,
    SEGA,
    SONY,
    STEAM,
    OTHER;

    public String getValue() {
        return this.name();
    }
}
