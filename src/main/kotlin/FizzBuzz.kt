interface FizzBuzz {



    fun Int.fizzBuzz(): String {
        return if(this%3==0) "Fizz"
        else if(this%5==0) "Buzz"
        else this.toString()
    }
}