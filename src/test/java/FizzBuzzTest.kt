import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest: FizzBuzz {



    @Test
    fun `when given a number, returns number`() {
        val num = getNumber(false, false)
        assertEquals(num.toString(), num.playGame())
    }



    fun getNumber(three: Boolean, five: Boolean): Int{
        return (Math.random()*100).toInt()
    }
}