package org.wahlzeit.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        EmailTestSuite.class

        // TODO: move these individual tests into sub-suites
        // FIXME: insert all test cases
})

public class AllTests {
}
