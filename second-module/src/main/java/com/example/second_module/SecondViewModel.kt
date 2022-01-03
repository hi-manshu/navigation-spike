package com.example.second_module

import androidx.lifecycle.ViewModel
import com.example.navigator.Navigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SecondViewModel @Inject constructor(
    private val navigator: Navigator
) : ViewModel(), Navigator by navigator {

}
