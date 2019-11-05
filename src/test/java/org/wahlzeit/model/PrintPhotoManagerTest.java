package org.wahlzeit.model;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class PrintPhotoManagerTest {
    private PrintPhotoManager manager;

    @Before
    public void setUp() {
        manager = PrintPhotoManager.getInstance();
        manager.init();

    }

    @Test
    public void getPhotoFromId() {
    }

    @Test
    public void savePhoto() {
    }

    @Test
    public void createPhoto() {
    }

    @Test
    public void testAddPhoto() throws IOException {
        manager.addPhoto(new PrintPhoto(PrintPhoto.Material.PETG));

    }

    @Test
    public void testGetHasPhoto() {
        PrintPhoto photo = manager.getPhoto(PhotoId.getRandomId());

        assertTrue(manager.hasPhoto(photo.id));
    }

    @Test
    public void getVisiblePhoto() {
    }
}