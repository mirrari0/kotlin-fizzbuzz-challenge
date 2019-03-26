interface FizzBuzz {



    fun Int.fizzBuzz(): String {
        return when {
            this%3==0 -> "Fizz"
            this%5==0 -> "Buzz"
            else -> this.toString()
        }
    }
}