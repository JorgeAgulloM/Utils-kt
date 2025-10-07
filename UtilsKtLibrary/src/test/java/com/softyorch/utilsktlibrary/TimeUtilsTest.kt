package com.softyorch.utilsktlibrary

import com.softyorch.utilsktlibrary.TimeUtils.deleteSeconds
import com.softyorch.utilsktlibrary.TimeUtils.getDateOfNow
import com.softyorch.utilsktlibrary.TimeUtils.getCurrentTimeOfNow
import com.softyorch.utilsktlibrary.TimeUtils.toCalendarTime
import com.softyorch.utilsktlibrary.TimeUtils.toDateFormattedISO8601
import org.junit.Test
import java.util.Calendar

class TimeUtilsTest {

    // Test para Calendar.toDateFormattedISO8601()
    @Test
    fun `toDateFormattedISO8601 returns correct ISO string`() {
        val calendar = Calendar.getInstance().apply {
            set(2024, Calendar.MAY, 21, 10, 30, 45)
        }
        val expected = "2024-05-21T10:30:45"
        assert(calendar.toDateFormattedISO8601() == expected)
    }

    // Test para Calendar.getDateOfNow()
    @Test
    fun `getDateOfNow from Calendar returns correct padded date string`() {
        val calendar = Calendar.getInstance().apply {
            set(2024, Calendar.JANUARY, 5) // Enero (mes 0), día 5
        }
        // La nueva implementación usa SimpleDateFormat, que formatea correctamente.
        val expected = "2024-01-05"
        assert(calendar.getDateOfNow() == expected)
    }

    // Test para Calendar.getCurrentTimeOfNow()
    @Test
    fun `getCurrentTimeOfNow from Calendar returns correct 24h time string`() {
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 14) // 2 PM en formato 24h
            set(Calendar.MINUTE, 30)
            set(Calendar.SECOND, 15)
        }
        // La nueva implementación usa HH para formato 24h.
        val expected = "14:30:15"
        assert(calendar.getCurrentTimeOfNow() == expected)
    }

    // Test para String.toCalendarTime()
    @Test
    fun `toCalendarTime parses full ISO string correctly`() {
        val dateString = "2024-05-21T10:30:45"
        val calendar = dateString.toCalendarTime()

        assert(calendar.get(Calendar.YEAR) == 2024)
        assert(calendar.get(Calendar.MONTH) == Calendar.MAY)
        assert(calendar.get(Calendar.DAY_OF_MONTH) == 21)
        assert(calendar.get(Calendar.HOUR_OF_DAY) == 10)
        assert(calendar.get(Calendar.MINUTE) == 30)
        assert(calendar.get(Calendar.SECOND) == 45)
    }

    @Test
    fun `toCalendarTime parses ISO string without seconds`() {
        val dateString = "2024-12-01T08:05"
        val calendar = dateString.toCalendarTime()

        assert(calendar.get(Calendar.YEAR) == 2024)
        assert(calendar.get(Calendar.MONTH) == Calendar.DECEMBER)
        assert(calendar.get(Calendar.DAY_OF_MONTH) == 1)
        assert(calendar.get(Calendar.HOUR_OF_DAY) == 8)
        assert(calendar.get(Calendar.MINUTE) == 5)
    }

    // Test para String.getDateOfNow()
    @Test
    fun `getDateOfNow from String returns correct date part`() {
        val dateTimeString = "2024-05-21T10:30:45"
        val expected = "2024-05-21"
        assert(dateTimeString.getDateOfNow() == expected)
    }

    @Test
    fun `getDateOfNow from String handles malformed string`() {
        val malformedString = "2024-05-21 10:30:45" // No contiene 'T'
        assert(malformedString.getDateOfNow() == malformedString)
    }

    // Test para String.getCurrentTimeOfNow()
    @Test
    fun `getCurrentTimeOfNow from String returns correct time part`() {
        val dateTimeString = "2024-05-21T10:30:45"
        val expected = "10:30:45"
        assert(dateTimeString.getCurrentTimeOfNow() == expected)
    }

    @Test
    fun `getCurrentTimeOfNow from String handles malformed string`() {
        val malformedString = "2024-05-21 10:30:45" // No contiene 'T'
        val expected = "00:00:00"
        assert(malformedString.getCurrentTimeOfNow() == expected)
    }

    // Test para String.deleteSeconds()
    @Test
    fun `deleteSeconds removes seconds from a full time string`() {
        val timeString = "10:30:45"
        val expected = "10:30"
        assert(timeString.deleteSeconds() == expected)
    }

    @Test
    fun `deleteSeconds on a string without seconds should not change it`() {
        val timeString = "10:30"
        // Con la corrección, este test ahora debe pasar.
        val expected = "10:30"
        assert(timeString.deleteSeconds() == expected)
    }

    @Test
    fun `deleteSeconds on a string without colon returns original`() {
        val timeString = "103045"
        assert(timeString.deleteSeconds() == timeString)
    }
}
