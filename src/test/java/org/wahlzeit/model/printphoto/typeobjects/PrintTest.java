package org.wahlzeit.model.printphoto.typeobjects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintTest {

    @Test
    public void getType() {
        PrintType orig_type = new PrintType();
        PrintType type = new Print(orig_type).getType();
        assertEquals(orig_type, type);
    }
}