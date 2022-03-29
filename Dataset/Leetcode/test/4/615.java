 class Solution {
    /**
     * 求nums1和nums2数组的长度和totalLength
     * 令mid= nums1和nums2的平均长度取整 +1,mid就要需要对两个数组的下标移动的次数
     * 使用两个下标(i=0,j=0)遍历两个数组,哪个数组下标对应的元素小,把这个元素缓存到secondmid中,然后数组的下标++,mid-- 直到 mid <=0
     * 如果totalLength是奇数,则两个数组从小到大第mid个数就是中位数
     * 如果totalLength是偶数,则两个数组从小到大,第mid和mid-1之和的平均值就是中位数
     */
    fun XXX(nums1: IntArray, nums2: IntArray): Double {
        var totalLength = nums1.size + nums2.size
        var moveTimes = totalLength / 2 + 1
        var i = 0
        var j = 0
        var median = 0.0
        var preMedian = 0.0
        while (moveTimes > 0 && i < nums1.size && j < nums2.size) {
            var elementInNum1 = nums1[i]
            var elementInNum2 = nums2[j]
            if (elementInNum1 < elementInNum2) {
                preMedian = median
                median = elementInNum1.toDouble()
                i++
            } else {
                preMedian = median
                median = elementInNum2.toDouble()
                j++
            }
            moveTimes--
        }
        println("moveTimes = ${moveTimes}")

        while (moveTimes > 0 && i < nums1.size) {
            var elementInNum1 = nums1[i]
            preMedian = median
            median = elementInNum1.toDouble()
            i++
            moveTimes--
        }
        while (moveTimes > 0 && j < nums2.size) {
            var elementInNum2 = nums2[j]
            preMedian = median
            median = elementInNum2.toDouble()
            j++
            moveTimes--
        }
        if (totalLength % 2 != 0) {
            return median
        } else {
            return (median + preMedian) / 2
        }
    }
}```

