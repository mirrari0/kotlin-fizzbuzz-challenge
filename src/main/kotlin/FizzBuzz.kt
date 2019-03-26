interface FizzBuzz {



    fun Int.fizzBuzz(): String {
        return if(this%3==0) "Fizz"
        else this.toString()
    }
}