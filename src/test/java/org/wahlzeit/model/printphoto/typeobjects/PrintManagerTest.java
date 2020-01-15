package org.wahlzeit.model.printphoto.typeobjects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintManagerTest {

    @Test
    public void getInstance() {
        PrintManager manager = PrintManager.getInstance();
        assertEquals(manager, PrintManager.getInstance());
    }

    @Test
    public void createPrint() {
        PrintManager manager = PrintManager.getInstance();
        Print print = manager.createPrint("SLA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void failCreatePrint() {
        PrintManager manager = PrintManager.getInstance();
        Print print = manager.createPrint("Bobby");
    }
}