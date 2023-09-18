package com.softyorch.utilsktlibrary

import android.content.Context
import android.widget.Toast

object ContextUtils {
    /**
     * Facilitates calling a toast from the context in use
     * */
    fun Context.showToast(msg: String) = Toast.makeText(
        this, msg, Toast.LENGTH_SHORT
    ).show()
}