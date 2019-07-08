package com.akramkhan.espresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.Toolbar
import android.widget.TextView
import org.hamcrest.CoreMatchers.allOf
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Main2ActivityTest {

    @Rule @JvmField
    var activityRule = ActivityTestRule(Main2Activity::class.java)

    @Test
    fun toolbarTitle() {
        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withParent(isAssignableFrom(Toolbar::class.java))
            )
        ).check(matches(withText("Main2Activity")))
    }
}