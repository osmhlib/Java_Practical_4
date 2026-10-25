package service;

public class ReportService {
    private final Formatter formatter;

    public ReportService(Formatter formatter) {
        this.formatter = formatter;
    }

    public void printReport(String text) {
        System.out.println(formatter.format(text));
    }
}