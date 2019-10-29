package org.wahlzeit.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.handlers.TellFriendTest;
import org.wahlzeit.model.*;
import org.wahlzeit.model.persistence.AbstractAdapterTest;
import org.wahlzeit.model.persistence.DatastoreAdapterTest;
import org.wahlzeit.services.EmailAddressTest;
import org.wahlzeit.services.LogBuilderTest;
import org.wahlzeit.services.mailing.EmailServiceTest;
import org.wahlzeit.testEnvironmentProvider.*;
import org.wahlzeit.utils.StringUtilTest;
import org.wahlzeit.utils.VersionTest;

@RunWith(Suite.class)

@Suite.SuiteClasses(value = {
        EmailTestSuite.class,

        // TODO: move these individual tests into sub-suites
        // FIXME: insert all test cases
        AbstractAdapterTest.class,
        AccessRightsTest.class,
        DatastoreAdapterTest.class,
        EmailAddressTest.class,
        EmailServiceTest.class,
        FlagReasonTest.class,
        GenderTest.class,
        GuestTest.class,
        LocalDatastoreServiceTestConfigProvider.class,
        LogBuilderTest.class,
        PhotoFilterTest.class,
        RegisteredOfyEnvironmentProvider.class,
        StringUtilTest.class,
        SysConfigProvider.class,
        TagsTest.class,
        TellFriendTest.class,
        UserServiceProvider.class,
        UserSessionProvider.class,
        UserStatusTest.class,
        ValueTest.class,
        VersionTest.class,
        WebFormHandlerProvider.class
})

public class AllTests {
}
