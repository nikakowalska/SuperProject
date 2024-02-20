package com.sliskaryba.api.enums;

public enum Dice {
    ONE("1"), TWO("2"), THREE("3"), UP("up");
    private final String value;

    Dice(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "value='" + value + '\'' +
                '}';
    }
}
