package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintPhotoTest {

    @Test
    public void testGetPrintMaterial() {
        PrintPhoto photo = new PrintPhoto();

        assertEquals(PrintPhoto.Material.UNKNOWN, photo.getPrintMaterial());
    }

}
