package yellowv.me.fanfou

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, funSum(2, 2))
        assertEquals(4, funSumOneLine(2, 2))

        val a: Int = 2
        var x = 3
        x += 1
        assertEquals(4, x)
        println("a is $a, x is $x.")
        assertEquals(5, max(4, 5))
    }

    private fun funSum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    private fun funSumOneLine(a: Int, b: Int) = a + b

    private fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

}
