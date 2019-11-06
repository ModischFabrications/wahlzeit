package org.wahlzeit.model;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrintPhotoManagerTest {

    @ClassRule
    public static SysConfigProvider sysConfigProvider = new SysConfigProvider();
    @ClassRule
    public static WebFormHandlerProvider webFormHandlerProvider = new WebFormHandlerProvider();

    @Rule
    public TestRule chain = RuleChain.
            outerRule(new LocalDatastoreServiceTestConfigProvider()).
            around(new RegisteredOfyEnvironmentProvider()).
            around(new UserSessionProvider());

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
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        PrintPhotoManager.getInstance().addPhoto(photo);

        assertEquals(photo, PrintPhotoManager.getInstance().getPhoto(photo.getId()));
    }

    @Test
    public void testGetHasPhoto() throws IOException {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        manager.addPhoto(photo);

        assertTrue(manager.hasPhoto(photo.getId()));
    }
}