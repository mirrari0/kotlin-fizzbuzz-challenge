import java.io.File

class WordSearchLoader(var fileDirectory:String) {

    val wantedWords = mutableListOf<String>()

    fun loadFile() {
        val file = File(fileDirectory)
        wantedWords.addAll(file.readText().split(","))
    }
}