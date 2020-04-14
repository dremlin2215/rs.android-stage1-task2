package subtask4

class Pangram {

    private val map = emptyMap<Int, MutableList<String>>().toMutableMap().toSortedMap()
    private val vowels = listOf<Char>(
        'a', 'A',
        'e', 'E',
        'i', 'I',
        'o', 'O',
        'u', 'U',
        'y', 'Y'
    )
    private val consonants = listOf<Char>(
        'b', 'B',
        'c', 'C',
        'd', 'D',
        'f', 'F',
        'g', 'G',
        'h', 'H',
        'j', 'J',
        'k', 'K',
        'l', 'L',
        'm', 'M',
        'n', 'N',
        'p', 'P',
        'q', 'Q',
        'r', 'R',
        's', 'S',
        't', 'T',
        'v', 'V',
        'w', 'W',
        'x', 'X',
        'z', 'Z'
    )


    fun getResult(inputString: String): String {
        return if (isPangram(inputString)) {
            transformText(inputString, vowels)
        } else {
            transformText(inputString, consonants)
        }
    }

    private fun transformText(inputString: String, list: List<Char>): String {
        val strArr = inputString.split(" ");
        for (str in strArr) {
            val numberOfLetters = countLetters(str, list)
            if (str.isBlank()) {
                continue
            }
            val transformedString =
                "" + numberOfLetters + transformString(str, list)
            if (!map.containsKey(numberOfLetters)) {
                map[numberOfLetters] = mutableListOf(transformedString);
            } else {
                map[numberOfLetters]?.add(transformedString);
            }
        }
        var result: String = ""
        for (key in map.keys) {
            for (str in map[key]!!) {
                result += "$str ";
            }
        }

        return result.trim()
    }

    private fun transformString(str: String, list: List<Char>): String {
        var resStr = "";
        for (i in str) {
            resStr += if (list.contains(i)) {
                i.toUpperCase();
            } else {
                i;
            }
        }
        return resStr
    }


    private fun isPangram(inputString: String): Boolean {
        val alphabet = mutableListOf<Char>(
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'
        )
        for (c in inputString) {
            if (alphabet.contains(c.toLowerCase())) {
                alphabet.remove(c.toLowerCase())
            }
        }
        if (alphabet.isEmpty()) {
            return true
        }
        return false
    }

    private fun countLetters(inputString: String, list: List<Char>): Int {
        var counter = 0;
        for (char in inputString) {
            if (list.contains(char)) {
                counter++
            }
        }
        return counter;
    }
}
