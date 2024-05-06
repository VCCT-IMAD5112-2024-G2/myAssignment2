package com.example.myassignment2pet

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Screen2Test {

    @Before
    fun setUp() {
        // Launch the activity under test
        ActivityScenario.launch(Screen2::class.java)
    }

    @Test
    fun testPetProgressBars() {
        // Check if the progress bars are displayed
        Espresso.onView(ViewMatchers.withId(R.id.hungerBar))
            .check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.cleanBar))
            .check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.happyBar))
            .check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testPetImageView() {
        // Check if the pet image view is displayed
        Espresso.onView(ViewMatchers.withId(R.id.imageView2))
            .check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testFeedButton() {
        // Check if the feed button is displayed
        Espresso.onView(ViewMatchers.withId(R.id.btnFeed))
            .check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testCleanButton() {
        // Check if the clean button is displayed
        Espresso.onView(ViewMatchers.withId(R.id.btnClean))
            .check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testPlayButton() {
        // Check if the play button is displayed
        Espresso.onView(ViewMatchers.withId(R.id.btnPlay))
            .check(matches(ViewMatchers.isDisplayed()))
    }
}
