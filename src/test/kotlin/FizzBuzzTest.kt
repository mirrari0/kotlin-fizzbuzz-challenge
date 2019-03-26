import junit.framework.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest: FizzBuzz {


    @Test
    fun `given one returns one`() {
        assertEquals("1", 1.fizzBuzz())
    }

    @Test
    fun `given multiple of three not five, returns fizz`() {
        assertEquals("Fizz", getNumber(true, false, 3).fizzBuzz())
    }

    @Test
    fun `given multiple of five not three, returns buzz`() {
        assertEquals("Buzz", getNumber(false, true, 5).fizzBuzz())
    }

    @Test
    fun `given multiple of five and three, returns FizzBuzz`() {
        assertEquals("FizzBuzz", getNumber(false, false, 15).fizzBuzz())
    }

    private fun getNumber(three: Boolean, five: Boolean, multiplier: Int): Int {
        var num: Int = (Math.random() * 100).toInt()
        while(true) {
            val startNum = num
            if((three && num%3!=0)) num++
            if((five && num%5!=0)) num++
            if((!three && num%3==0)) num++
            if((!five && num%5==0)) num++
            if(startNum == num) break
        }
        return num * multiplier
    }
}