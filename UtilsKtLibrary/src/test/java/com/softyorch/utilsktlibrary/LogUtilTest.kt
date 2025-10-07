package com.softyorch.utilsktlibrary

import android.util.Log
import com.softyorch.utilsktlibrary.LogUtil.logDebug
import com.softyorch.utilsktlibrary.LogUtil.logError
import com.softyorch.utilsktlibrary.LogUtil.logExample
import com.softyorch.utilsktlibrary.LogUtil.logInfo
import com.softyorch.utilsktlibrary.LogUtil.logWaring
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockedStatic
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LogUtilTest {

    private lateinit var mockedLog: MockedStatic<Log>

    private val testLabelTag = "LOG_UTIL"
    private val testScope = "TestScope"

    @Before
    fun setUp() {
        // Mockeamos la clase estática android.util.Log antes de cada test
        mockedLog = Mockito.mockStatic(Log::class.java)
    }

    @After
    fun tearDown() {
        // Cerramos y liberamos el mock después de cada test
        mockedLog.close()
    }

    @Test
    fun `logDebug debe llamar a Log d con la etiqueta y el mensaje correctos`() {
        // Arrange
        val message = "Este es un mensaje de debug"
        val expectedLog = "$testScope -> $message"

        // Act
        testScope.logDebug(message)

        // Assert
        // Verificamos que se llamó a Log.d con los parámetros esperados
        mockedLog.verify { Log.d(testLabelTag, expectedLog) }
    }

    @Test
    fun `logInfo debe llamar a Log i con la etiqueta y el mensaje correctos`() {
        // Arrange
        val message = "Este es un mensaje de información"
        val expectedLog = "$testScope -> $message"

        // Act
        testScope.logInfo(message)

        // Assert
        mockedLog.verify { Log.i(testLabelTag, expectedLog) }
    }

    @Test
    fun `logWaring debe llamar a Log w con la etiqueta y el mensaje correctos`() {
        // Nota: El nombre de la función original tiene un error tipográfico ('logWaring')
        // Arrange
        val message = "Este es un mensaje de advertencia"
        val expectedLog = "$testScope -> $message"

        // Act
        testScope.logWaring(message)

        // Assert
        mockedLog.verify { Log.w(testLabelTag, expectedLog) }
    }

    @Test
    fun `logError debe llamar a Log e con la etiqueta y el mensaje correctos`() {
        // Arrange
        val message = "Este es un mensaje de error"
        val expectedLog = "$testScope -> $message"

        // Act
        testScope.logError(message)

        // Assert
        mockedLog.verify { Log.e(testLabelTag, expectedLog) }
    }

    @Test
    fun `logExample debe llamar a los cuatro metodos de log`() {
        // Arrange
        val scope = "ExampleScope"

        // Act
        scope.logExample()

        // Assert
        mockedLog.verify { Log.d(testLabelTag, "$scope -> Hi, I am a Debug log") }
        mockedLog.verify { Log.i(testLabelTag, "$scope -> Hi, I am a Info log") }
        mockedLog.verify { Log.w(testLabelTag, "$scope -> Hi, I am a Warning log") }
        mockedLog.verify { Log.e(testLabelTag, "$scope -> Hi, I am a Error log") }
    }
}
