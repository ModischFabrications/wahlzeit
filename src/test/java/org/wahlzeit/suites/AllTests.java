package org.wahlzeit.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.handlers.TellFriendTest;
import org.wahlzeit.model.*;
import org.wahlzeit.model.persistence.AbstractAdapterTest;
import org.wahlzeit.model.persistence.DatastoreAdapterTest;
import org.wahlzeit.services.LogBuilderTest;
import org.wahlzeit.utils.StringUtilTest;
import org.wahlzeit.utils.VersionTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        EmailTestSuite.class,

        // TODO: move these individual tests into sub-suites
        AbstractAdapterTest.class,
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
