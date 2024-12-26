fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = listOf(1, 2, null, 4, 5)
    val result2 = list2.map { it?.times(2) ?: 0 }
    println(result2) // Output: [2, 4, 0, 8, 10]

    //Alternative solution using let
    val result3 = list2.map { it?.let { it * 2 } ?: 0 }
    println(result3) // Output: [2, 4, 0, 8, 10]
}