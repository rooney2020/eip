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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    Profession(String profession) {
        this.profession = profession;
    }
}
