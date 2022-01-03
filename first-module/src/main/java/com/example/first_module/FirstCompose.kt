package com.example.first_module

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.navigator.routes.SecondDestination

@Composable
fun FirstComposable() {
    val viewModel = hiltViewModel<FirstViewModel>()
    Button(onClick = {
        viewModel.navigate(SecondDestination.route())
    }, modifier = Modifier.padding(16.dp),
        content = {
            Text(
                "I am the first screen!",
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    )
}
