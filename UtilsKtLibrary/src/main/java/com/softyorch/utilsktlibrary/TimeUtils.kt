package com.softyorch.utilsktlibrary

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

object TimeUtils {

    private val monthListValues = listOf(0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

    /**
     * Transforms the date of a calendar to ISO8601 format without milliseconds and timezone
     * by returning the result in a String.
     *
     * Calendar -> String
     *
     * In case of error, it will return a string with the same format as expected but with the
     * values set to 0.
     */
    fun Calendar.toDateFormattedISO8601(): String = try {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        val currentDate = sdf.format(this.time)
        currentDate.split(" ")[0] + "T" + currentDate.split(" ")[1]
    } catch (e: Exception) {
        e.printStackTrace()
        "0000-00-00T00:00:00"
    }

    /**
     * Returns a String of the date of a Calendar.
     *
     * Calendar -> String
     *
     * In case of error, it will return a string with the same format as expected but with the
     * values set to 0.
     */
    fun Calendar.getDateOfNow(): String = try {
        val year = this.get(Calendar.YEAR)
        val month = this.get(Calendar.MONTH)
        val day = this.get(Calendar.DAY_OF_MONTH)
        "$year-$month-$day"
    } catch (e: Exception) {
        e.printStackTrace()
        "0000-00-00"
    }

    /**
     * Returns a String of the time of a Calendar.
     *
     * Calendar -> String
     *
     * In case of error, it will return a string with the same format as expected but with the
     * values set to 0.
     */
    fun Calendar.getCurrentTimeOfNow(): String = try {
        val hour = this.get(Calendar.HOUR)
        val minutes = this.get(Calendar.MINUTE)
        val seconds = this.get(Calendar.SECOND)
        "$hour:$minutes:$seconds"
    } catch (e: Exception) {
        e.printStackTrace()
        "00:00:00"
    }

    /**
     * Transforms a full String date into a Calendar. No need to pass seconds.
     *
     * String -> Calendar
     *
     * On error, will return a Calendar.getInstance() value.
     */
    fun String.toCalendarTime(): Calendar = try {
        Calendar.getInstance().apply {
            val noSeconds = -1
            val seconds = if ("." in this@toCalendarTime)
                this@toCalendarTime.split(".")[1].toInt()
            else noSeconds

            val minutes = this@toCalendarTime.split(":")[1].toInt()
            val hours = this@toCalendarTime.split("T")[1].split(":")[0].toInt()
            val day = this@toCalendarTime.split("-")[2].split("T")[0].toInt()
            val month = this@toCalendarTime.split("-")[1].split("-")[0].toInt()
            val year = this@toCalendarTime.split("-")[0].toInt()
            if (seconds == noSeconds)
                set(year, monthListValues[month], day, hours, minutes)
            else
                set(year, monthListValues[month], day, hours, minutes, seconds)
        }
    } catch (e: Exception) {
        e.printStackTrace()
        Calendar.getInstance()
    }

    /**
     * Returns from an ISO8601 String dateTime value, the date value in String type.
     *
     * String -> String
     *
     * In case of error, it will return a string with the same format as expected but with the
     * values set to 0.
     */
    fun String.getDateOfNow(): String = try {
        this.split("T")[0]
    } catch (e: Exception) {
        e.printStackTrace()
        "0000-00-00"
    }

    /**
     * Returns from an ISO8601 String dateTime value, the time value in String type.
     *
     * String -> String
     *
     * In case of error, it will return a string with the same format as expected but with the
     * values set to 0.
     */
    fun String.getCurrentTimeOfNow(): String = try {
        this.split("T")[1]
    } catch (e: Exception) {
        e.printStackTrace()
        "00:00:00"
    }

    /**
     * Removes seconds from a String time offset.
     *
     * String 12:23:34 -> String 12:23
     *
     * */
    fun String.deleteSeconds(): String = try {
        this.substringBeforeLast(":")
    } catch (e: Exception) {
        e.printStackTrace()
        this
    }

}