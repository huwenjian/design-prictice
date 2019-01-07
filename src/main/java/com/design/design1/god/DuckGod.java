package com.design.design1.god;

public class DuckGod {

    String name;
    String age;
    String haven;
    String color;
    String type;


    @Override
    public String toString() {
        return "DuckGod{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", haven='" + haven + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHaven() {
        return haven;
    }

    public void setHaven(String haven) {
        this.haven = haven;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
