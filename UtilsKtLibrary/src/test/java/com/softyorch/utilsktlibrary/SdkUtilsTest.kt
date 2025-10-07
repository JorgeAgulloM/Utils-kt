package com.softyorch.utilsktlibrary

import org.junit.After
import org.junit.Test

class SdkUtilsTest {

    @After
    fun tearDown() {
        SdkUtils.testingSdkInt = null
    }

    private fun setSdkInt(sdkLevel: Int) {
        SdkUtils.testingSdkInt = sdkLevel
    }

    // --- Tests para funciones sdkAndUp ---

    @Test
    fun `sdk36AndUp se ejecuta en SDK 36 o superior, no en 35`() {
        setSdkInt(35)
        assert(SdkUtils.sdk36AndUp { true } == null)
        setSdkInt(36)
        assert(SdkUtils.sdk36AndUp { true } == true)
    }

    @Test
    fun `sdk35AndUp se ejecuta en SDK 35 o superior, no en 34`() {
        setSdkInt(34)
        assert(SdkUtils.sdk35AndUp { true } == null)
        setSdkInt(35)
        assert(SdkUtils.sdk35AndUp { true } == true)
    }

    @Test
    fun `sdk34AndUp se ejecuta en SDK 34 o superior, no en 33`() {
        setSdkInt(33)
        assert(SdkUtils.sdk34AndUp { true } == null)
        setSdkInt(34)
        assert(SdkUtils.sdk34AndUp { true } == true)
    }

    @Test
    fun `sdk33AndUp se ejecuta en SDK 33 o superior, no en 32`() {
        setSdkInt(32)
        assert(SdkUtils.sdk33AndUp { true } == null)
        setSdkInt(33)
        assert(SdkUtils.sdk33AndUp { true } == true)
    }

    @Test
    fun `sdk32AndUp se ejecuta en SDK 32 o superior, no en 31`() {
        setSdkInt(31)
        assert(SdkUtils.sdk32AndUp { true } == null)
        setSdkInt(32)
        assert(SdkUtils.sdk32AndUp { true } == true)
    }

    @Test
    fun `sdk31AndUp se ejecuta en SDK 31 o superior, no en 30`() {
        setSdkInt(30)
        assert(SdkUtils.sdk31AndUp { true } == null)
        setSdkInt(31)
        assert(SdkUtils.sdk31AndUp { true } == true)
    }

    @Test
    fun `sdk30AndUp se ejecuta en SDK 30 o superior, no en 29`() {
        setSdkInt(29)
        assert(SdkUtils.sdk30AndUp { true } == null)
        setSdkInt(30)
        assert(SdkUtils.sdk30AndUp { true } == true)
    }

    @Test
    fun `sdk29AndUp se ejecuta en SDK 29 o superior, no en 28`() {
        setSdkInt(28)
        assert(SdkUtils.sdk29AndUp { true } == null)
        setSdkInt(29)
        assert(SdkUtils.sdk29AndUp { true } == true)
    }

    @Test
    fun `sdk28AndUp se ejecuta en SDK 28 o superior, no en 27`() {
        setSdkInt(27)
        assert(SdkUtils.sdk28AndUp { true } == null)
        setSdkInt(28)
        assert(SdkUtils.sdk28AndUp { true } == true)
    }

    @Test
    fun `sdk27AndUp se ejecuta en SDK 27 o superior, no en 26`() {
        setSdkInt(26)
        assert(SdkUtils.sdk27AndUp { true } == null)
        setSdkInt(27)
        assert(SdkUtils.sdk27AndUp { true } == true)
    }

    @Test
    fun `sdk26AndUp se ejecuta en SDK 26 o superior, no en 25`() {
        setSdkInt(25)
        assert(SdkUtils.sdk26AndUp { true } == null)
        setSdkInt(26)
        assert(SdkUtils.sdk26AndUp { true } == true)
    }

    @Test
    fun `sdk25AndUp se ejecuta en SDK 25 o superior, no en 24`() {
        setSdkInt(24)
        assert(SdkUtils.sdk25AndUp { true } == null)
        setSdkInt(25)
        assert(SdkUtils.sdk25AndUp { true } == true)
    }

    @Test
    fun `sdk24AndUp se ejecuta en SDK 24 o superior, no en 23`() {
        setSdkInt(23)
        assert(SdkUtils.sdk24AndUp { true } == null)
        setSdkInt(24)
        assert(SdkUtils.sdk24AndUp { true } == true)
    }

    // --- Tests para funciones sdkDown ---

    @Test
    fun `sdk36Down se ejecuta en SDK 35 o inferior, no en 36`() {
        setSdkInt(36)
        assert(SdkUtils.sdk36Down { true } == null)
        setSdkInt(35)
        assert(SdkUtils.sdk36Down { true } == true)
    }

    @Test
    fun `sdk35Down se ejecuta en SDK 34 o inferior, no en 35`() {
        setSdkInt(35)
        assert(SdkUtils.sdk35Down { true } == null)
        setSdkInt(34)
        assert(SdkUtils.sdk35Down { true } == true)
    }

    @Test
    fun `sdk34Down se ejecuta en SDK 33 o inferior, no en 34`() {
        setSdkInt(34)
        assert(SdkUtils.sdk34Down { true } == null)
        setSdkInt(33)
        assert(SdkUtils.sdk34Down { true } == true)
    }

    @Test
    fun `sdk33Down se ejecuta en SDK 32 o inferior, no en 33`() {
        setSdkInt(33)
        assert(SdkUtils.sdk33Down { true } == null)
        setSdkInt(32)
        assert(SdkUtils.sdk33Down { true } == true)
    }

    @Test
    fun `sdk32Down se ejecuta en SDK 31 o inferior, no en 32`() {
        setSdkInt(32)
        assert(SdkUtils.sdk32Down { true } == null)
        setSdkInt(31)
        assert(SdkUtils.sdk32Down { true } == true)
    }

    @Test
    fun `sdk31Down se ejecuta en SDK 30 o inferior, no en 31`() {
        setSdkInt(31)
        assert(SdkUtils.sdk31Down { true } == null)
        setSdkInt(30)
        assert(SdkUtils.sdk31Down { true } == true)
    }

    @Test
    fun `sdk30Down se ejecuta en SDK 29 o inferior, no en 30`() {
        setSdkInt(30)
        assert(SdkUtils.sdk30Down { true } == null)
        setSdkInt(29)
        assert(SdkUtils.sdk30Down { true } == true)
    }

    @Test
    fun `sdk29Down se ejecuta en SDK 28 o inferior, no en 29`() {
        setSdkInt(29)
        assert(SdkUtils.sdk29Down { true } == null)
        setSdkInt(28)
        assert(SdkUtils.sdk29Down { true } == true)
    }

    @Test
    fun `sdk28Down se ejecuta en SDK 27 o inferior, no en 28`() {
        setSdkInt(28)
        assert(SdkUtils.sdk28Down { true } == null)
        setSdkInt(27)
        assert(SdkUtils.sdk28Down { true } == true)
    }

    @Test
    fun `sdk27Down se ejecuta en SDK 26 o inferior, no en 27`() {
        setSdkInt(27)
        assert(SdkUtils.sdk27Down { true } == null)
        setSdkInt(26)
        assert(SdkUtils.sdk27Down { true } == true)
    }

    @Test
    fun `sdk26Down se ejecuta en SDK 25 o inferior, no en 26`() {
        setSdkInt(26)
        assert(SdkUtils.sdk26Down { true } == null)
        setSdkInt(25)
        assert(SdkUtils.sdk26Down { true } == true)
    }

    @Test
    fun `sdk25Down se ejecuta en SDK 24 o inferior, no en 25`() {
        setSdkInt(25)
        assert(SdkUtils.sdk25Down { true } == null)
        setSdkInt(24)
        assert(SdkUtils.sdk25Down { true } == true)
    }

    @Test
    fun `sdk24Down se ejecuta en SDK 23 o inferior, no en 24`() {
        setSdkInt(24)
        assert(SdkUtils.sdk24Down { true } == null)
        setSdkInt(23)
        assert(SdkUtils.sdk24Down { true } == true)
    }

    // --- Tests para propiedades val ---

    @Test
    fun `propiedad sdk36AndUp es correcta`() {
        setSdkInt(35)
        assert(!SdkUtils.sdk36AndUp)
        setSdkInt(36)
        assert(SdkUtils.sdk36AndUp)
    }

    @Test
    fun `propiedad sdk35AndUp es correcta`() {
        setSdkInt(34)
        assert(!SdkUtils.sdk35AndUp)
        setSdkInt(35)
        assert(SdkUtils.sdk35AndUp)
    }

    @Test
    fun `propiedad sdk34AndUp es correcta`() {
        setSdkInt(33)
        assert(!SdkUtils.sdk34AndUp)
        setSdkInt(34)
        assert(SdkUtils.sdk34AndUp)
    }

    @Test
    fun `propiedad sdk33AndUp es correcta`() {
        setSdkInt(32)
        assert(!SdkUtils.sdk33AndUp)
        setSdkInt(33)
        assert(SdkUtils.sdk33AndUp)
    }

    @Test
    fun `propiedad sdk32AndUp es correcta`() {
        setSdkInt(31)
        assert(!SdkUtils.sdk32AndUp)
        setSdkInt(32)
        assert(SdkUtils.sdk32AndUp)
    }

    @Test
    fun `propiedad sdk31AndUp es correcta`() {
        setSdkInt(30)
        assert(!SdkUtils.sdk31AndUp)
        setSdkInt(31)
        assert(SdkUtils.sdk31AndUp)
    }

    @Test
    fun `propiedad sdk30AndUp es correcta`() {
        setSdkInt(29)
        assert(!SdkUtils.sdk30AndUp)
        setSdkInt(30)
        assert(SdkUtils.sdk30AndUp)
    }

    @Test
    fun `propiedad sdk29AndUp es correcta`() {
        setSdkInt(28)
        assert(!SdkUtils.sdk29AndUp)
        setSdkInt(29)
        assert(SdkUtils.sdk29AndUp)
    }

    @Test
    fun `propiedad sdk28AndUp es correcta`() {
        setSdkInt(27)
        assert(!SdkUtils.sdk28AndUp)
        setSdkInt(28)
        assert(SdkUtils.sdk28AndUp)
    }

    @Test
    fun `propiedad sdk27AndUp es correcta`() {
        setSdkInt(26)
        assert(!SdkUtils.sdk27AndUp)
        setSdkInt(27)
        assert(SdkUtils.sdk27AndUp)
    }

    @Test
    fun `propiedad sdk26AndUp es correcta`() {
        setSdkInt(25)
        assert(!SdkUtils.sdk26AndUp)
        setSdkInt(26)
        assert(SdkUtils.sdk26AndUp)
    }

    @Test
    fun `propiedad sdk25AndUp es correcta`() {
        setSdkInt(24)
        assert(!SdkUtils.sdk25AndUp)
        setSdkInt(25)
        assert(SdkUtils.sdk25AndUp)
    }

    @Test
    fun `propiedad sdk24AndUp es correcta`() {
        setSdkInt(23)
        assert(!SdkUtils.sdk24AndUp)
        setSdkInt(24)
        assert(SdkUtils.sdk24AndUp)
    }
}
