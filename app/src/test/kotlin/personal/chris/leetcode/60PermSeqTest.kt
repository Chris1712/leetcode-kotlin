package personal.chris.leetcode

import org.junit.jupiter.api.Nested
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.Test
import kotlin.test.assertEquals

class `60PermSeqTest` {

    val target = `60PermSeq`()

    @Nested
    inner class GetPermutation {

        @ParameterizedTest
        @CsvSource(
            "1,1,1",
            "2,1,12",
            "2,2,21",
            "3,3,213",
            "3,6,321",
            "5,1,12345",
            "5,120,54321",
            "5,119,54312"
        )
        fun testGetPermutation(n: Int, k: Int, expected: String) {
            val result = target.getPermutation(n, k)

            assertEquals(expected, result)
        }
    }

    @Nested
    inner class Factorial {

        @ParameterizedTest
        @CsvSource("1,1", "4,24")
        fun factorials(input: Int, expected: Int) {
            val result = target.factorial(input)

            assertEquals(expected, result)
        }
    }

    @Nested
    inner class GetPermutationInts() {

        @Test
        fun `n=1, k=1`() {
            val result = target.getPermutationInts(1, 1)

            assertEquals(listOf(0), result)
        }

        @Test
        fun `n=2, k=1`() {
            val result = target.getPermutationInts(2, 1)

            assertEquals(listOf(0, 0), result)
        }

        @Test
        fun `n=2, k=2`() {
            val result = target.getPermutationInts(2, 2)

            assertEquals(listOf(1, 0), result)
        }

        @Test
        fun `n=3, k=3`() {
            val result = target.getPermutationInts(3, 3)

            assertEquals(listOf(1,0,0), result)
        }

        @Test
        fun `n=3, k=6`() {
            val result = target.getPermutationInts(3, 6)

            assertEquals(listOf(2,1,0), result)
        }

        @Test
        fun `n=5, k=1`() {
            val result = target.getPermutationInts(5, 1)

            assertEquals(listOf(0,0,0,0,0), result)
        }

        @Test
        fun `n=5, k=120`() {
            val result = target.getPermutationInts(5, 120)

            assertEquals(listOf(4,3,2,1,0), result)
        }
    }

}