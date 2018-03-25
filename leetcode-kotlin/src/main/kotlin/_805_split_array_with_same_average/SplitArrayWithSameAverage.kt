package _805_split_array_with_same_average;

/**
 * Created by eth4 on 25/3/18.
 */

/*
 * https://leetcode.com/contest/weekly-contest-77/problems/split-array-with-same-average/
 *
 * In a given integer array A, we must move every element of A to either list B or list C. (B and C initially start empty.)
 *
 * Return true if and only if after such a move, it is possible that the average value of B is equal to the average value of C, and B and C are both non-empty.
 *
 * Example :
 * Input:
 * [1,2,3,4,5,6,7,8]
 * Output: true
 * Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have the average of 4.5.
 * Note:
 *
 * The length of A will be in the range [1, 30].
 * A[i] will be in the range of [0, 10000].
 */

class SplitArrayWithSameAverage {
    fun splitArraySameAverage(A: IntArray): Boolean {
        val half = A.sum() / 2
        val dp = Array(10000, { 0 })

        for (i in 1..A.size) {
            for (j in half..A[i]) {

            }

        }
        return true
    }

}

