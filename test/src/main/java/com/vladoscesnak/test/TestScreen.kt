package com.vladoscesnak.test

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination

interface TestNavigator {
    fun openSomething()
}

@Destination
@Composable
fun TestScreen(){
    Column(){
        Text("Test")
    }
}