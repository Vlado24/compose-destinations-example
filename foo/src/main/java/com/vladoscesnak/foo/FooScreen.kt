package com.vladoscesnak.foo

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination

interface FooNavigator {
    fun openBar()
}

@Destination
@Composable
fun FooScreen() {
    Column() {
        Text("Foo screen")
    }
}