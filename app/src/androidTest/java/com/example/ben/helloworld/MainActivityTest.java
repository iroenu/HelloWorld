package com.example.ben.helloworld;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.hello_world_text))
                .check(matches(withText(R.string.hello_world)));
        onView(withId(R.id.author_date))
                .check(matches(withText(R.string.author_date)));
    }

    @Test
    public void onCreateOptionsMenu() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText(R.string.hello)).perform(click());
    }

    @Test
    public void onOptionsItemSelected() {

    }
}