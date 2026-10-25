package model;

public class Circle extends Shape implements Drawable, Scalable {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public void describe() {
        Drawable.super.describe();
        Scalable.super.describe();
        System.out.println("This is Circle");
    }
}