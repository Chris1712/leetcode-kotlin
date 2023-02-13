package personal.chris.leetcode

class `44NQueens` {

    companion object {
        fun solveNQueens(n: Int): List<List<String>> {
            val solutions = solveBoard(n, n, emptyList())
            return solutions.map { intSolutionToStrings(it) }
        }

        /**
         * Recursively solve the board going row by row, returning a list of solutions
         * Each solution is a list of Integers, where the index is the row and the value is the column index
         */
        fun solveBoard(n: Int, remaining: Int, queenPositions: List<Int>): List<List<Int>> {
            if (remaining == 0) {
                return listOf(queenPositions)
            }
            val currentRowIndex = queenPositions.size

            val possiblePositions = MutableList<Int>(n) { 1 }

            // Determine available positions in current row (set position in index to 0 where not available)

            // 1/3: Can't be in the same column
            queenPositions.forEach{ possiblePositions[it] = 0 }

            // 2/3: Can't be in the same right diagonal
            queenPositions.forEachIndexed { index, value ->
                val rightDiagonalIndex = value + (currentRowIndex - index)
                if (rightDiagonalIndex < n) {
                    possiblePositions[rightDiagonalIndex] = 0
                }
            }

            // 3/3: Can't be in the same left diagonal
            queenPositions.forEachIndexed { index, value ->
                val leftDiagonalIndex = value - (currentRowIndex - index)
                if (leftDiagonalIndex >= 0) {
                    possiblePositions[leftDiagonalIndex] = 0
                }
            }

            // For each available position, call solveBoard with this row populated
            return possiblePositions
                .mapIndexed { index, value -> Pair(index, value) }
                .filter { it.second == 1 } // Only where available
                .flatMap { solveBoard(queenPositions = queenPositions.plus(it.first), n = n, remaining = remaining-1) }
        }

        fun intSolutionToStrings(queenPositions: List<Int>): List<String> {
            return queenPositions.map { ".".repeat(it) + "Q" + ".".repeat(queenPositions.size - it - 1) }
        }


    }
}