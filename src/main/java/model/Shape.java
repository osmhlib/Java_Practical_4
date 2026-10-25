package model;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public void printName() {
        System.out.println("Shape: " + name);
    }
}