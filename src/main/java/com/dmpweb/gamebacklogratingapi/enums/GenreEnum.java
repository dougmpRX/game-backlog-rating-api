package com.dmpweb.gamebacklogratingapi.enums;

public enum GenreEnum {
    ACTION,
    ADVENTURE,
    HORROR,
    RACING,
    ROLEPLAYING,
    SHOOTER,
    STRATEGY,
    SURVIVAL,
    OTHER;

    public String getValue() {
        return this.name();
    }
}
