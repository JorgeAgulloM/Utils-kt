package com.softyorch.utilsktlibrary

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

object TimeUtils {

    // Formateadores estándar para evitar recrearlos constantemente
    private val isoFormatterWithSeconds = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT)
    private val isoFormatterWithoutSeconds = SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.ROOT)
    private val dateFormatter = SimpleDateFormat("yyyy-MM-dd", Locale.ROOT)
    private val timeFormatter = SimpleDateFormat("HH:mm:ss", Locale.ROOT)

    /**
     * Formats a Calendar date into an ISO8601 string without milliseconds and timezone.
     */
    fun Calendar.toDateFormattedISO8601(): String = try {
        isoFormatterWithSeconds.format(this.time)
    } catch (e: Exception) {
        e.printStackTrace()
        "0000-00-00T00:00:00"
    }

    /**
     * Returns a formatted string (yyyy-MM-dd) of a Calendar's date.
     */
    fun Calendar.getDateOfNow(): String = try {
        dateFormatter.format(this.time)
    } catch (e: Exception) {
        e.printStackTrace()
        "0000-00-00"
    }

    /**
     * Returns a formatted string (HH:mm:ss) of a Calendar's time in 24-hour format.
     */
    fun Calendar.getCurrentTimeOfNow(): String = try {
        timeFormatter.format(this.time)
    } catch (e: Exception) {
        e.printStackTrace()
        "00:00:00"
    }

    /**
     * Parses a String date (ISO8601 format, with or without seconds) into a Calendar.
     */
    fun String.toCalendarTime(): Calendar {
        val calendar = Calendar.getInstance()
        try {
            // Intenta primero parsear con el formato que incluye segundos
            calendar.time = isoFormatterWithSeconds.parse(this)!!
        } catch (_: ParseException) {
            try {
                // Si falla, intenta parsear con el formato sin segundos
                calendar.time = isoFormatterWithoutSeconds.parse(this)!!
            } catch (e2: ParseException) {
                e2.printStackTrace()
                // En caso de error, devuelve una instancia de Calendar en el momento actual
                return Calendar.getInstance()
            }
        }
        return calendar
    }

    /**
     * Extracts the date part (yyyy-MM-dd) from an ISO8601 String.
     */
    fun String.getDateOfNow(): String = try {
        this.split("T")[0]
    } catch (e: Exception) {
        e.printStackTrace()
        this
    }

    /**
     * Extracts the time part (HH:mm:ss) from an ISO8601 String.
     */
    fun String.getCurrentTimeOfNow(): String = try {
        this.split("T")[1]
    } catch (e: Exception) {
        e.printStackTrace()
        "00:00:00"
    }

    /**
     * Removes the seconds part from a time string (e.g., "12:23:34" -> "12:23").
     * If the string does not contain seconds, it returns it unchanged.
     */
    fun String.deleteSeconds(): String = try {
        if (this.count { it == ':' } >= 2) {
            this.substringBeforeLast(":")
        } else {
            this
        }
    } catch (e: Exception) {
        e.printStackTrace()
        this
    }
}
