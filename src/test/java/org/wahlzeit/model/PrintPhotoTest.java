package org.wahlzeit.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.wahlzeit.testEnvironmentProvider.LocalDatastoreServiceTestConfigProvider;
import org.wahlzeit.testEnvironmentProvider.RegisteredOfyEnvironmentProvider;
import org.wahlzeit.testEnvironmentProvider.UserSessionProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrintPhotoTest {

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
