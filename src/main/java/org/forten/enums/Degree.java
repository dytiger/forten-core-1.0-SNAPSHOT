package org.forten.enums;

public enum Degree {
    JMS("初中"), HMS("高中"), JC("大专"), UC("大本"), GS("研究生"), BA("学士"), MA("硕士"), DC("博士"), OTHER("其它");

    private String name;

    Degree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
