package org.wahlzeit.model;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrintPhotoFactoryTest {
    // Fixes for Photo-Importing with AppEngine
    @ClassRule
    public static SysConfigProvider sysConfigProvider = new SysConfigProvider();
    @ClassRule
    public static WebFormHandlerProvider webFormHandlerProvider = new WebFormHandlerProvider();

    @Rule
    public TestRule chain = RuleChain.
            outerRule(new LocalDatastoreServiceTestConfigProvider()).
            around(new RegisteredOfyEnvironmentProvider()).
            around(new UserSessionProvider());

    private PrintPhotoFactory factory;

    @Before
    public void setUp() {
        PrintPhotoFactory.initialize();
        factory = PrintPhotoFactory.getInstance();
    }

    @Test
    public void testSingletonConstructor() {
        PrintPhotoFactory same_factory = PrintPhotoFactory.getInstance();

        assertEquals(factory, same_factory);
    }

    @Test
    public void testCreatePhoto() {
        PrintPhoto photo = factory.createPhoto();
        assertNotEquals(null, photo);
    }
}