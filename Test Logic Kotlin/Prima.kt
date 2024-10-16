fun main() {
    // Meminta input dari pengguna
    print("Masukkan batas atas untuk mencari bilangan prima: ")
    val input = readLine()

    // Mengonversi input ke integer
    val limit = input?.toIntOrNull()

    if (limit == null || limit < 2) {
        println("Silakan masukkan angka bulat positif yang lebih besar atau sama dengan 2.")
    } else {
        val primes = sieveOfEratosthenes(limit)
        println("Bilangan prima hingga $limit:")
        println(primes.joinToString(", "))
    }
}

// Fungsi untuk menemukan semua bilangan prima hingga 'limit' menggunakan Sieve of Eratosthenes
fun sieveOfEratosthenes(limit: Int): List<Int> {
    val isPrime = BooleanArray(limit + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    val sqrtLimit = Math.sqrt(limit.toDouble()).toInt()

    for (i in 2..sqrtLimit) {
        if (isPrime[i]) {
            for (j in i * i..limit step i) {
                isPrime[j] = false
            }
        }
    }

    return isPrime.mapIndexed { index, prime -> if (prime) index else -1 }
        .filter { it != -1 }
}
