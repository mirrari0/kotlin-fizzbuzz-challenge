import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WordSearchLoaderTest {

    lateinit var wordSearch: WordSearchLoader

    @Before
    fun setup() {
        wordSearch = WordSearchLoader("sample.txt")
    }

    @Test
    fun `when loading file, sets the first line to the list of wanted words`() {
        val expected = arrayOf("BONES","KHAN","KIRK","SCOTTY","SPOCK","SULU","UHURA")
        wordSearch.loadFile()
        assertEquals(expected, wordSearch.wantedWords)
    }
}