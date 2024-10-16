fun main() {
    // Meminta input dari pengguna
    print("Masukkan jumlah angka dalam deret Fibonacci: ")
    val input = readlnOrNull()

    // Mengonversi input ke integer
    val n = input?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Silakan masukkan angka yang valid dan lebih besar dari 0.")
    } else {
        val fibonacciSequence = mutableListOf<Long>()
        for (i in 0 until n){
            fibonacciSequence.add(generateFibonacci(i))
        }
        println("Deret Fibonacci hingga $n angka:")
        println(fibonacciSequence.joinToString(", ").reversed())
    }
}

// Fungsi untuk menghasilkan deret Fibonacci
fun generateFibonacci(n: Int): Long {
    return when(n){
        0 -> 0
        1 -> 1
        else -> generateFibonacci(n - 1) + generateFibonacci(n -2)
    }
}
