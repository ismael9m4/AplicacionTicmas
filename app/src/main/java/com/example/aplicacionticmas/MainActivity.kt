package com.example.aplicacionticmas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicacionticmas.databinding.ActivityMainBinding
import com.example.aplicacionticmas.viewmodel.MainViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aplicacionticmas.model.Comparador

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btnComparar.setOnClickListener{
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()

            val comparador = Comparador(text1, text2)
            val result = mainViewModel.compararTextos(comparador)
            val resultMessage = if (result) "Los textos son iguales." else "Los textos son diferentes."
            binding.txtResultado.text = resultMessage
        }
    }
}