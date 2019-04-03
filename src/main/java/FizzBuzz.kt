interface FizzBuzz {


    fun Int.playGame(): String {
        return when {
            this % 3 == 0 -> "fizz"
            this % 5 == 0 -> "buzz"
            else -> this.toString()
        }
    }
}