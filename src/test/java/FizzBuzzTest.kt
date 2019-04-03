import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest: FizzBuzz {



    @Test
    fun `when given a number, returns number`() {
        val num = getNumber(false, false, 1)
        assertEquals(num.toString(), num.playGame())
    }

    @Test
    fun `when given a multiple of three and not five, returns fizz`() {
        assertEquals("fizz", getNumber(true, false, 3).playGame())
    }

    @Test
    fun `when given a multiple of five and not three, returns buzz`() {
        assertEquals("buzz", getNumber(false, true, 5).playGame())
    }

    @Test
    fun `when given a multiple of fifteen, returns fizzbuzz`() {
        assertEquals("fizzbuzz", getNumber(true, true, 15).playGame())
    }




    private fun getNumber(three: Boolean, five: Boolean, multiplier: Int): Int{
        var num =  (Math.random()*100).toInt()
        while(true) {
            val start = num
            if(!five && num%5 ==0) num++
            if(!three && num%3==0) num++
            if(num == start) break
        }
        return num * multiplier
    }
}