package com.esportfy.esportfyb.enums;

public enum QuadraType {

    FUTSAL("futsal"),
    BASQUETE("basquete"),
    VOLEI("volei"),
    FUTEBOL("futebol"),
    KART("kart"),
    TENIS("tenis"),
    HANDEBOL("handebol"),
    FUTEBOL_AMERICANO("futebol americano");



    private String type;

    QuadraType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
