package com.example.aplicacionticmas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aplicacionticmas.model.Comparador

class MainViewModel:ViewModel() {
    fun compararTextos(comparador: Comparador): Boolean {
        return comparador.text1 == comparador.text2
    }
}