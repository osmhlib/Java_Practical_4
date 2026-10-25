package app;

import model.Circle;
import model.Drawable;
import model.Rectangle;
import model.Scalable;

import service.ReportService;
import service.TableFormatter;
import service.TextFormatter;

public class main {

    public static void main(String[] args) {

        System.out.println("=== Abstract class ===");

        Circle circle = new Circle(5);

        circle.printName();
        System.out.println("Area: " + circle.area());

        System.out.println("\n=== Interfaces ===");

        Drawable drawable = circle;
        drawable.draw();
        // drawable.scale(2);

        Scalable scalable = circle;
        scalable.scale(2);

        System.out.println("Area after scaling: " + circle.area());

        circle.describe();


        System.out.println("\n=== Rectangle ===");

        Rectangle rectangle = new Rectangle(4, 6);

        rectangle.printName();
        rectangle.draw();
        System.out.println("Area: " + rectangle.area());


        System.out.println("\n=== Dependency Injection ===");

        ReportService textService =
                new ReportService(new TextFormatter());

        textService.printReport("Java Practical 4");

        ReportService tableService =
                new ReportService(new TableFormatter());

        tableService.printReport("Java Practical 4");
    }
}