package personal.chris.leetcode

class `60PermSeq` {

    fun getPermutation(n: Int, k: Int): String {
        val choices = getPermutationInts(n, k)

        val symbols = (1..n).toMutableList()

        return choices.map { symbols.removeAt(it) }
            .joinToString("")
    }

    /**
     * Return result as list of integers representing choice of symbol for that position (0-indexed)
     */
    fun getPermutationInts(n: Int, k: Int): List<Int> {
        if (n == 1) {
            return listOf(0)
        }

        val leadingDigitChoice: Int = (k - 1) / factorial(n - 1)
        val newK = k - (leadingDigitChoice * factorial(n - 1))
        return listOf(leadingDigitChoice) + getPermutationInts(n - 1, newK)
    }

    fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n-1);
    }

}