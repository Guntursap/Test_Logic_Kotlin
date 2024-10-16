fun main(){
    println("Masukan String Pertama : ")
    val firstInput = readlnOrNull()
    println("Masukan String Kedua : ")
    val secondInput = readlnOrNull()

    val sortedFirst = firstInput?.toCharArray()?.sorted()
    println(sortedFirst)
    val sortedSecond = secondInput?.toCharArray()?.sorted()
    println(sortedSecond)

    if (firstInput.isNullOrBlank() || secondInput.isNullOrBlank()){
        println("Input Tidak boleh kosong")
    }else{
        if (gAnagram(firstInput, secondInput)){
            println("\"$firstInput\" dan \"$secondInput\" adalah anagram")
        }else{
            println("\"$firstInput\" dan \"$secondInput\" bukan anagram")
        }
    }
}
fun gAnagram(f: String, s:String): Boolean{

    val fPro = f.lowercase().filter { it.isLetterOrDigit() }
    val sPro = s.lowercase().filter { it.isLetterOrDigit() }

    val fSorted = fPro.toCharArray().sorted()
    val sSorted = sPro.toCharArray().sorted()
    return fSorted == sSorted
}