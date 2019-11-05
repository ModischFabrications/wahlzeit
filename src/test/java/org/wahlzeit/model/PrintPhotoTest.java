package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrintPhotoTest {

    @Test()
    public void testConstructor() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
    }

    @Test(expected = ExceptionInInitializerError.class)
    public void testInvalidConstructor() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        fail("Construction was successful but should throw an error");
    }

    @Test
    public void testGetPrintMaterial() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);

        assertEquals(PrintPhoto.Material.PETG, photo.getPrintMaterial());
    }

}
