class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        # 暴力法，先合并两个数组，然后再进行找中位数
        nums = sorted(nums1 + nums2)
        def mid_num(ls):
            n = len(ls)
            if n % 2 == 0:
                return (ls[n // 2 - 1] + ls[n // 2]) / 2
            else:
                return ls[n // 2]
        return  mid_num(nums)


