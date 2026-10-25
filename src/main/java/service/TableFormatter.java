package service;

public class TableFormatter implements Formatter {
    @Override
    public String format(String text) {
        return "| Report |\n| " + text + " |";
    }
}