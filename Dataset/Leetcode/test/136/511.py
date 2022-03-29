 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # list转换为set集合后，元素均只出现一次
        nums2 = set(nums)
        # 只出现一次的元素的集合之和乘以2，减去原列表中元素之和所得到的差
        # 就是那个单独的元素的值
        return sum(nums2) * 2 - sum(nums)

