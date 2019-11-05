package org.wahlzeit.model;

import org.junit.Before;
import org.junit.Test;

public class PrintPhotoFactoryTest {
    private PrintPhotoFactory factory;

    @Before
    public void setUp() {
        PrintPhotoFactory.initialize();
        //factory = PrintPhotoFactory.getInstance();
        factory = new PrintPhotoFactory();
    }

    @Test
    public void testCreatePhoto() {
        factory.createPhoto();
    }

}