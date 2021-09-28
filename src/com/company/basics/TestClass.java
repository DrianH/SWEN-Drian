package com.company.basics;

public class TestClass {
    public static final String VALUE = "TEST";

    private String name;

    public static String getValue(){
        return VALUE;
    }

    public TestClass(){
        this.name = "Default";
    }

    public TestClass(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
