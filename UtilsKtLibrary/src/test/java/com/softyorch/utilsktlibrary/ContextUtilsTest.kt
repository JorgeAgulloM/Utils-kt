package com.softyorch.utilsktlibrary

import android.content.Context
import android.widget.Toast
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockedStatic
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ContextUtilsTest {

    // Mock para la clase estática Toast
    private lateinit var mockedToast: MockedStatic<Toast>

    // Mocks para el Contexto y la instancia de Toast que se devuelve
    @Mock
    private lateinit var mockContext: Context

    @Mock
    private lateinit var mockToast: Toast

    @Before
    fun setUp() {
        // Inicializamos el mock estático de la clase Toast antes de cada test
        // Esto nos permite interceptar las llamadas a Toast.makeText()
        mockedToast = Mockito.mockStatic(Toast::class.java)
    }

    @After
    fun tearDown() {
        // Cerramos y liberamos el mock estático después de cada test para no afectar a otros tests
        mockedToast.close()
    }

    @Test
    fun `showToast debe llamar a Toast makeText con los parametros correctos y luego llamar a show`() {
        // Arrange
        val message = "This is a test toast"
        val duration = Toast.LENGTH_SHORT

        // Definimos el comportamiento esperado:
        // Cuando se llame a Toast.makeText con estos parámetros específicos...
        mockedToast.`when`<Toast> { Toast.makeText(mockContext, message, duration) }.thenReturn(mockToast)

        // Act
        // Llamamos a la función de extensión que queremos probar
        with(ContextUtils) {
            mockContext.showToast(message)
        }

        // Assert
        // 1. Verificamos que Toast.makeText fue llamado exactamente con los parámetros que esperamos
        mockedToast.verify { Toast.makeText(mockContext, message, duration) }

        // 2. Verificamos que el méto_do .show() fue llamado en el objeto Toast que nuestro makeText simulado devolvió
        Mockito.verify(mockToast).show()
    }
}
