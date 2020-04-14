package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val thisHour = Integer.parseInt(hour)
        val _minutes = Integer.parseInt(minute)
        if (thisHour !in 0..12 || _minutes !in 0..59) {
            return "";
        }
        val result = when (_minutes) {
            0 -> "" + intToRequiredHour(number = thisHour, intShift = false) + " o' clock"
            1 -> "" + intToRequiredHour(number = _minutes, intShift = false) + " minute past " +
                    intToRequiredHour(number = thisHour, intShift = false)
            in 2..14, in 16..29 -> "" + intToRequiredHour(number = _minutes, intShift = false) + " minutes past " +
                    intToRequiredHour(number = thisHour, intShift = false)
            15 -> "quarter past " + intToRequiredHour(number = thisHour, intShift = false)
            30 -> "half past " + intToRequiredHour(number = thisHour, intShift = false)
            in 31..44, in 46..58 -> "" + intToRequiredHour(number = 60 - _minutes, intShift = false) + " minutes to " +
                    intToRequiredHour(number = thisHour, intShift = true)
            45 -> "quarter to " + intToRequiredHour(number = thisHour, intShift = true)
            else -> ""
        }

        return result;
    }

    fun intToRequiredHour(number: Int, intShift: Boolean): String {
        var requiredNumber: Int = number
        if (intShift) {
            requiredNumber++
        }
        var result: String = when (requiredNumber) {
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10 -> "ten"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "fifteen"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            19 -> "nineteen"
            20 -> "twenty"
            21 -> "twenty one"
            22 -> "twenty two"
            23 -> "twenty three"
            24 -> "twenty four"
            25 -> "twenty five"
            26 -> "twenty six"
            27 -> "twenty seven"
            28 -> "twenty eight"
            29 -> "twenty nine"
            30 -> "thirty"
            31 -> "thirty one"
            32 -> "thirty three"
            33 -> "thirty three"
            34 -> "thirty four"
            35 -> "thirty five"
            36 -> "thirty six"
            37 -> "thirty seven"
            38 -> "thirty eight"
            39 -> "thirty nine"
            40 -> "forty"
            41 -> "forty one"
            42 -> "forty two"
            43 -> "forty three"
            44 -> "forty four"
            45 -> "forty five"
            46 -> "forty six"
            47 -> "forty seven"
            48 -> "forty eight"
            49 -> "forty nine"
            50 -> "fifty"
            51 -> "fifty one"
            52 -> "fifty two"
            53 -> "fifty three"
            54 -> "fifty four"
            55 -> "fifty five"
            56 -> "fifty six"
            57 -> "fifty seven"
            58 -> "fifty eight"
            59 -> "fifty nine"
            else -> ""
        }
        return result;
    }
}
