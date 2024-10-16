fun main() {
    // Meminta input dari pengguna
    print("Masukkan sebuah string: ")
    val input = readlnOrNull()

    if (input.isNullOrBlank()) {
        println("Input tidak boleh kosong.")
    } else {
        // Memeriksa apakah string tersebut palindrome
        if (isPalindrome(input)) {
            println("\"$input\" adalah palindrome.")
        } else {
            println("\"$input\" bukan palindrome.")
        }
    }
}

// Fungsi untuk memeriksa apakah sebuah string adalah palindrome
fun isPalindrome(s: String): Boolean {
    // Mengubah string menjadi huruf kecil dan menghapus non-alfanumerik
    val processedString = s.lowercase().filter { it.isLetterOrDigit() }

    // Membalik string
    val reversedString = processedString.reversed()

    // Membandingkan string asli dengan yang terbalik
    return processedString == reversedString
}
