package org.forten.enums;

public enum PapersType {
    IDCard("身份证"), Passport("护照"), MilitaryCard("军人证");

    private String name;

    PapersType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
