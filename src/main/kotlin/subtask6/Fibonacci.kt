package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        val result = IntArray(3)
        var counter = 1;
        var tmpRes = 0;
        var fibPrev: Int = 0;
        var fibCurr: Int = 0;
        while (tmpRes <= n) {
            fibCurr = fibonacci(counter);
            fibPrev = fibonacci(counter - 1)
            if ((fibCurr * fibPrev) == n) {
                result[0] = fibPrev
                result[1] = fibCurr
                result[2] = 1;
                return result;
            }
            tmpRes = fibCurr * fibPrev
            counter++
        }
        result[0] = fibPrev
        result[1] = fibCurr
        result[2] = 0;
        return result;
    }

    fun fibonacci(n: Int, a: Int = 0, b: Int = 1): Int =
        when (n) {
            0 -> a
            1 -> b
            else -> fibonacci(n - 1, b, a + b)
        }
}
