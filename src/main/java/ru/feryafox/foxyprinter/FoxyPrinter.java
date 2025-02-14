package ru.feryafox.foxyprinter;

import java.util.ArrayList;
import java.util.List;

public class FoxyPrinter {
    private static FoxyPrinter instance;

    private final List<String> messages = new ArrayList<>();

    private FoxyPrinter() {
    }

    public static FoxyPrinter getInstance() {
        if (instance == null) {
            instance = new FoxyPrinter();
        }
        return instance;
    }

    public void print(String s) {
        System.out.print(s);
        messages.add(s);
    }

    public void println(String s) {
        messages.add(s);
        System.out.println(s);
    }

    public void printf(String format, Object... args) {
        System.out.printf(format, args);
        messages.add(String.format(format, args));
    }

    public List<String> getMessages() {
        return messages;
    }
}
