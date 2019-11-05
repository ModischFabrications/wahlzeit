package org.wahlzeit.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        PrintPhotoTest.class,
        PrintPhotoManagerTest.class,
        PrintPhotoFactoryTest.class
})
public class PrintPhotoTestSuite {
}
