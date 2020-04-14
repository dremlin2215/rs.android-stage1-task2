package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val _day = Integer.parseInt(day);
        val _month = Integer.parseInt(month)
        val _year = Integer.parseInt(year)
        val result:String
        result = try{
            val date = LocalDate.of(_year, _month, _day)
            date.format(DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru", "RU")))
        }catch (e : DateTimeException){
            "Такого дня не существует"
        }
        return result
    }
}
