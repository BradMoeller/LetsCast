package com.jorgecoca.letscast.test;


import android.test.ActivityInstrumentationTestCase2;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

import com.jorgecoca.letscast.HomeScreenActivity;
import com.jorgecoca.letscast.R;

public class HomeScreenActivityTest extends ActivityInstrumentationTestCase2<HomeScreenActivity> {

    @SuppressWarnings("deprecation")
    public HomeScreenActivityTest() {
        super(HomeScreenActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void test_HelloWorldIsPresent() {
        onView(withId(R.id.hello_world_text)).check(matches(withText("Hello world!")));
    }

}
