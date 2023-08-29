package com.example.aplicacionticmas

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith
import android.os.Bundle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.mockito.Mockito
import com.example.aplicacionticmas.viewmodel.MainViewModel
import com.example.aplicacionticmas.model.Comparador
import org.junit.After
import org.junit.Before
import org.junit.Rule
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.ext.junit.rules.ActivityScenarioRule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testCompararTextos() {

        Espresso.onView(ViewMatchers.withId(R.id.editText1))
            .perform(ViewActions.typeText("Hola"))

        Espresso.onView(ViewMatchers.withId(R.id.editText2))
            .perform(ViewActions.typeText("Hola"))

        Espresso.onView(ViewMatchers.withId(R.id.btn_comparar))
            .perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.txt_resultado))
            .check(ViewAssertions.matches(ViewMatchers.withText("Los textos son iguales.")))
    }
}