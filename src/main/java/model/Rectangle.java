package model;

public class Rectangle extends Shape implements Drawable, Scalable {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public void describe() {
        Drawable.super.describe();
        Scalable.super.describe();
        System.out.println("This is Rectangle");
    }
}