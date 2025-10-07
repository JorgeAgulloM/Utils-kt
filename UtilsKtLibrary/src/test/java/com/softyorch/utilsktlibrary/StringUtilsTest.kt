package com.softyorch.utilsktlibrary

import com.softyorch.utilsktlibrary.StringUtils.deleteAccents
import com.softyorch.utilsktlibrary.StringUtils.toCapitalized
import org.junit.Test

class StringUtilsTest {

    @Test
    fun `toCapitalized capitalizes the first letter of a lowercase string`() {
        val original = "hello world"
        val expected = "Hello world"
        assert(original.toCapitalized() == expected)
    }

    @Test
    fun `toCapitalized does not change an already capitalized string`() {
        val original = "Hello World"
        assert(original.toCapitalized() == original)
    }

    @Test
    fun `toCapitalized handles an empty string`() {
        val original = ""
        assert(original.toCapitalized() == original)
    }

    @Test
    fun `toCapitalized handles a single lowercase character`() {
        val original = "a"
        val expected = "A"
        assert(original.toCapitalized() == expected)
    }

    @Test
    fun `toCapitalized does not change a single uppercase character`() {
        val original = "Z"
        assert(original.toCapitalized() == original)
    }

    @Test
    fun `toCapitalized does not change a string starting with a number`() {
        val original = "123go"
        assert(original.toCapitalized() == original)
    }

    @Test
    fun `deleteAccents removes all kinds of accents`() {
        val original = "áéíóúÁÉÍÓÚàèìòùÀÈÌÒÙâêîôûÂÊÎÔÛäëïöüÄËÏÖÜçÇñÑ"
        val expected = "aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUcCnN"
        assert(original.deleteAccents() == expected)
    }

    @Test
    fun `deleteAccents works on a full sentence`() {
        val original = "El pingüino se comió el jamón de Múnich."
        val expected = "El pinguino se comio el jamon de Munich."
        assert(original.deleteAccents() == expected)
    }

    @Test
    fun `deleteAccents does not change a string without accents`() {
        val original = "A string with no accents"
        assert(original.deleteAccents() == original)
    }

    @Test
    fun `deleteAccents handles an empty string`() {
        val original = ""
        assert(original.deleteAccents() == original)
    }
}
