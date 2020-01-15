package org.wahlzeit.model.printphoto.typeobjects;

import org.junit.Test;

public class PrintTypeTest {
    PrintManager manager = PrintManager.getInstance();

    @Test
    public void createInstance() {
        PrintType type = new PrintType(manager);
    }

    @Test
    public void addSubType() {
        PrintType type = new PrintType(manager);
        PrintType subtype = new PrintType(manager);
    }

    @Test
    public void isSubtypeOf() {

    }
}