package com.vladoscesnak.composedestinationexample

import androidx.navigation.NavController
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.vladoscesnak.foo.FooNavigator
import com.vladoscesnak.test.TestNavigator

class CommonNavGraphNavigator(
    private val navGraph: NavGraphSpec,
    private val navController: NavController
) : TestNavigator, FooNavigator {
    override fun openSomething() {
        TODO("Not yet implemented")
    }

    override fun openBar() {
        TODO("Not yet implemented")
    }
}