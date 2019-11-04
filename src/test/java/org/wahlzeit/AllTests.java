package org.wahlzeit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.handlers.TellFriendTest;
import org.wahlzeit.model.*;
import org.wahlzeit.model.persistence.DatastoreAdapterTest;
import org.wahlzeit.services.EmailTestSuite;
import org.wahlzeit.services.LogBuilderTest;
import org.wahlzeit.utils.StringUtilTest;
import org.wahlzeit.utils.VersionTest;

@RunWith(Suite.class)

// currently 86 tests, all successful
@Suite.SuiteClasses({
        EmailTestSuite.class,

        // TODO: move these individual tests into sub-suites
        // Abstract* and *Provider are excluded, just like in the previous version
        AccessRightsTest.class,
        DatastoreAdapterTest.class,
        FlagReasonTest.class,
        GenderTest.class,
        GuestTest.class,
        LogBuilderTest.class,
        PhotoFilterTest.class,
        StringUtilTest.class,
        TagsTest.class,
        TellFriendTest.class,
        UserStatusTest.class,
        ValueTest.class,
        VersionTest.class,
})

public class AllTests {
}
