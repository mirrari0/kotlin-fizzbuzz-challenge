import junit.framework.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest: FizzBuzz {


    @Test
    fun `given one returns one`() {
        assertEquals("1", 1.fizzBuzz())
    }
}