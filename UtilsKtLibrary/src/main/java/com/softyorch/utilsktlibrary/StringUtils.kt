package com.softyorch.utilsktlibrary

import java.text.Normalizer
import java.util.Locale

object StringUtils {
    /**
     * Facilitates the conversion to Capitalisation which previously could be done with capitalize()
     * and is now deprecated.
     * */
    fun String.toCapitalized(): String = this.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            locale = Locale.getDefault()
        ) else it.toString()
    }

    /**
     * Removes accents, useful e.g. for string comparisons.
     * */
    fun String.deleteAccents(): String {
        val normalizedText = Normalizer.normalize(this, Normalizer.Form.NFD)
        return normalizedText.replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "")
    }

}