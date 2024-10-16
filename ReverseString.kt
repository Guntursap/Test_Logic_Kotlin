fun main(){
    println("Masukan Sebuah String: ")
    val input = readlnOrNull()

    if (input.isNullOrEmpty()){
        println("String tidak boleh kosong")
    }else{
        val reversedString = reversedString(input)
        println("String Terbalik \"$reversedString\"")
        val reversedStringManual = reversedStringManual(input)
        println("String Terbalik Manual \"$reversedStringManual\"")
        val reversedEachWord = reversedEachWord(input)
        println("Kalimat terbalik \"$reversedEachWord\"")
        val reversedStringFiltered = reversedStringFiltered(input)
        println("String Terbalik Filter \"$reversedStringFiltered\"")
    }
}

fun reversedString(s: String): String{
    return s.reversed()
}

fun reversedStringManual(s: String): String{
    var reversed = ""
    for (i in s.length - 1 downTo 0){
        reversed += s[i]
    }
    return reversed
}

fun reversedEachWord(s: String): String{
    return s.split(" ").joinToString(" "){it.reversed()}
}

fun reversedStringFiltered(s: String): String{
    return s.filter { it.isLetterOrDigit() }.reversed()
}