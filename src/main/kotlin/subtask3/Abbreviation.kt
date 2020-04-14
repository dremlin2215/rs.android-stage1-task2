package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val matched = mutableListOf<Char>()
        val tmpString = a.toUpperCase();
        var charOnPosition = b[0];
        var index = 0;
        for (element in tmpString) {
            if (charOnPosition == element.toUpperCase()) {
                matched.add(charOnPosition)
                index++;
                if (index >= b.length) {
                    break
                } else {
                    charOnPosition = b[index]
                }
            }
        }
        var result = ""
        for (char in matched) {
            result += char
        }
        return if (b == result) "YES" else "NO"
    }
}
