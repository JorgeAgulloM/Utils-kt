package com.softyorch.utilsktlibrary

import android.util.Log

object LogUtil {

    private var labelTag = "LOG_UTIL"

    /**
     * The String you extend from will be the start of the Log text.
     *
     * Launch a Debug type Log, with LABEL 'LOG_UTIL'.
     * @param debug shall be the contents of the Log.
     * */
    fun String.logDebug(debug: String) = debug("$this -> $debug")

    /**
     * The String you extend from will be the start of the Log text.
     *
     * Launch a Info type Log, with LABEL 'LOG_UTIL'.
     * @param info shall be the contents of the Log.
     * */
    fun String.logInfo(info: String) = info("$this -> $info")

    /**
     * The String you extend from will be the start of the Log text.
     *
     * Launch a Warning type Log, with LABEL 'LOG_UTIL'.
     * @param warning shall be the contents of the Log.
     * */
    fun String.logWaring(warning: String) = warning("$this -> $warning")

    /**
     * The String you extend from will be the start of the Log text.
     *
     * Launch a Error type Log, with LABEL 'LOG_UTIL'.
     * @param error shall be the contents of the Log.
     * */
    fun String.logError(error: String) = error("$this -> $error")

    private fun debug(debug: String) = Log.d(labelTag, debug)
    private fun info(info: String) = Log.i(labelTag, info)
    private fun warning(info: String) = Log.w(labelTag, info)
    private fun error(info: String) = Log.e(labelTag, info)

    /**
     * Launch an example to see in console how each log is displayed.
     * */
    fun String.logExample() {
        this.apply {
            logDebug("Hi, I am a Debug log")
            logInfo("Hi, I am a Info log")
            logWaring("Hi, I am a Warning log")
            logError("Hi, I am a Error log")
        }
    }

}
