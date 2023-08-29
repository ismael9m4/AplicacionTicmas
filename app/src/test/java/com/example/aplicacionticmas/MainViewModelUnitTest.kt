package com.example.aplicacionticmas

import com.example.aplicacionticmas.viewmodel.MainViewModel
import org.junit.Rule
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.test.*
import org.junit.Assert
import org.junit.Test
import org.junit.Before
import org.junit.After
import org.mockito.Mockito
import com.example.aplicacionticmas.model.Comparador
class MainViewModelUnitTest {
    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {
        // Realizar limpieza aquí si es necesario
    }

    @Test
    fun testCompararTextosIguales() {
        // Arrange
        val comparadorMock = Comparador("hola", "hola")

        // Act
        val resultado = viewModel.compararTextos(comparadorMock)

        // Assert
        Assert.assertTrue(resultado)
    }

    @Test
    fun testCompararTextosDiferentes() {
        // Arrange
        val comparadorMock = Comparador("hola", "mundo")

        // Act
        val resultado = viewModel.compararTextos(comparadorMock)

        // Assert
        Assert.assertFalse(resultado)
    }
}