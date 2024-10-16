fun main(){
    println("Input Number")
    val maxCount = readlnOrNull()?.toInt()
    val range = 1..maxCount!!
    for(i in range){
        if (i % 3 == 0 && i % 5 == 0){
            println("finzzBuzz")
        }else if (i % 3 == 0){
            println("Fizz")
        }else if (i % 5 == 0){
            println("Buzz")
        }else{
            println(i)
        }
    }
}