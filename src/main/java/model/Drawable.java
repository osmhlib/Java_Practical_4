package model;

public interface Drawable {

    void draw();

    default void describe() {
        System.out.println("Drawable object");
    }
}