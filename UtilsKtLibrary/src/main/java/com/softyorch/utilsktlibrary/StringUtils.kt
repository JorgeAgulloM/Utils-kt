package com.softyorch.utilsktlibrary

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
}