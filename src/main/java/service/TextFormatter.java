package service;

public class TextFormatter implements Formatter {
    @Override
    public String format(String text) {
        return "Text report: " + text;
    }
}