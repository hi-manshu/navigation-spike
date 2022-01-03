package com.example.second_module

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SecondComposable() {
    val viewModel = hiltViewModel<SecondViewModel>()
    Button(onClick = {
        viewModel.navigateUp()
    }, modifier = Modifier.padding(16.dp),
        content = {
            Text(
                "I am the second screen!",
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    )
}
