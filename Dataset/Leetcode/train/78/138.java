class Solution {
    fun XXX(nums: IntArray): List<List<Int>> {
        return (0 until 1.shl(nums.size)).map { i -> nums.filterIndexed { idx, _ -> i.and(1.shl(idx)) != 0 } }
    }
}

