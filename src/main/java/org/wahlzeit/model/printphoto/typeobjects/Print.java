package org.wahlzeit.model.printphoto.typeobjects;

public class Print {
    // no setter, immutable
    private PrintType type;
    private PrintManager manager;

    // TODO: add manager -> make self-assigning factory?

    // TODO: add to PrintPhoto

    // TODO:

    Print(PrintType type) {
        this.type = type;
    }

    public PrintType getType() {
        return type;
    }
}
