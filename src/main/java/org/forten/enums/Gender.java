package org.forten.enums;

public enum Gender {
    Male("男"),Female("女"),UNKNOWN("未知");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
