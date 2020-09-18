/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.lambda;

/**
 * @author KSC
 * @description
 */
public enum Profession {
    /**
     * Painter
     */
    PAINTER("Painter"),

    /**
     * Singer
     */
    SINGER("Singer");

    private String profession;

    Profession(String profession) {
        this.profession = profession;
    }
}
