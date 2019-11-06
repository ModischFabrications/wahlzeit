package org.wahlzeit.model;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrintPhotoTest {

    @ClassRule
    public static SysConfigProvider sysConfigProvider = new SysConfigProvider();
    @ClassRule
    public static WebFormHandlerProvider webFormHandlerProvider = new WebFormHandlerProvider();

    @Rule
    public TestRule chain = RuleChain.
            outerRule(new LocalDatastoreServiceTestConfigProvider()).
            around(new RegisteredOfyEnvironmentProvider()).
            around(new UserSessionProvider());

    @Test()
    public void testConstructor() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        assertEquals(PrintPhoto.Material.PETG, photo.getPrintMaterial());
    }

/*    @Test(expected = ExceptionInInitializerError.class)
    public void testInvalidConstructor() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        fail("Construction was successful but should throw an error");
    }*/

    @Test
    public void testNotEqualMaterial() {
        PrintPhoto photo = new PrintPhoto(PrintPhoto.Material.PETG);
        PrintPhoto photo2 = new PrintPhoto(PrintPhoto.Material.PETG);

        assertNotEquals(photo, photo2);
    }

}
