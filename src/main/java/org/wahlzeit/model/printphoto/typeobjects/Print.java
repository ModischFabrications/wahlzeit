package org.wahlzeit.model.printphoto.typeobjects;

public class Print {
    // no setter, immutable
    private PrintType type;
    private PrintManager manager;

    Print(PrintType type, PrintManager manager) {
        this.type = type;
        this.manager = manager;
    }

    public PrintType getType() {
        return type;
    }

    public PrintManager getManager() {
        return manager;
    }
}
