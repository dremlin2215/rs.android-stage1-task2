package subtask5

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val blockC = when (blockB) {
            String::class -> calcString(blockA);
            Int::class -> calcInt(blockA);
            LocalDate::class -> calcDate(blockA)
            else -> println("No Action")
        }
        return blockC;
    }

    private fun calcDate(blockA: Array<*>): Any {
        var date = LocalDate.MIN;
        for (a in blockA) {
            if (a is LocalDate) {
                if (date < a) {
                    date = a
                }
            }
        }
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    }

    private fun calcInt(blockA: Array<*>): Int {
        var sum = 0;
        for (a in blockA) {
            if (a is Int) {
                sum += a;
            }
        }
        return sum;
    }

    private fun calcString(blockA: Array<*>): String {
        val builder = StringBuilder()
        for (a in blockA) {
            if (a is String) {
                builder.append(a)
            }
        }
        return builder.toString();
    }

}