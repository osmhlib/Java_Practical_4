package model;

public interface Scalable {

    void scale(double factor);

    default void describe() {
        System.out.println("Scalable object");
    }
}