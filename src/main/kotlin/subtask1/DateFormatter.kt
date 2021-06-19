package subtask1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        try {
            var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            var m = when (date.month) {
                Month.JANUARY -> "января"
                Month.FEBRUARY -> "февраля"
                Month.MARCH -> "марта"
                Month.APRIL -> "апреля"
                Month.MAY -> "мая"
                Month.JUNE -> "июня"
                Month.JULY -> "июля"
                Month.AUGUST -> "августа"
                Month.SEPTEMBER -> "сентября"
                Month.OCTOBER -> "октября"
                Month.NOVEMBER -> "ноября"
                Month.DECEMBER -> "декабря"
            }
            var dow = when (date.dayOfWeek) {
                DayOfWeek.MONDAY -> "понедельник"
                DayOfWeek.TUESDAY -> "вторник"
                DayOfWeek.WEDNESDAY -> "среда"
                DayOfWeek.THURSDAY -> "четверг"
                DayOfWeek.FRIDAY -> "пятница"
                DayOfWeek.SATURDAY -> "суббота"
                DayOfWeek.SUNDAY -> "воскресенье"
            }
            return "$day $m, $dow"
        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }
}
