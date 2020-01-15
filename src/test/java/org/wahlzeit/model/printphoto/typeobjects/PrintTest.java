package org.wahlzeit.model.printphoto.typeobjects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintTest {
    PrintManager manager = PrintManager.getInstance();

    @Test
    public void getType() {
        PrintType orig_type = new PrintType(manager);
        PrintType type = new Print(orig_type, null).getType();
        assertEquals(orig_type, type);
    }

    @Test
    public void getManager() {
        PrintManager orig_manager = PrintManager.getInstance();
        PrintType orig_type = new PrintType(manager);
        PrintManager manager = new Print(orig_type, orig_manager).getManager();
        assertEquals(orig_manager, manager);
    }
}