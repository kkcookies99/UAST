 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums3 = nums1 + nums2
        nums3.sort()
        nums3_len = len(nums3)
        if nums3_len == 1:
            return float(nums3[0])
        if nums3_len % 2 == 0:
            return float((nums3[nums3_len // 2] + nums3[nums3_len // 2 -1]) / 2)
        else:
            return float(nums3[nums3_len // 2])

