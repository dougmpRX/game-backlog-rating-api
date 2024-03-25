package com.dmpweb.gamebacklogratingapi.enums;

import lombok.Getter;

@Getter
public enum GenreEnum {
    ACTION (1, "Action"),
    ADVENTURE (2, "Adventure"),
    HORROR (3, "Horror"),
    RACING (4, "Racing"),
    ROLEPLAYING (5, "Role-playing"),
    SHOOTER (6, "Shooter"),
    STRATEGY (7, "Strategy"),
    SURVIVAL (8, "Survival"),
    OTHER (9, "Other");

    private Integer value;
    private String description;

    private GenreEnum(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public static String getDescriptionByValue(int value) {
        for (GenreEnum genre : GenreEnum.values()) {
            if (genre.getValue() == value) {
                return genre.getDescription();
            }
        }
        throw new IllegalArgumentException("Invalid genre value: " + value);
    }
}
