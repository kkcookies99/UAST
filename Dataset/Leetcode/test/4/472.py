 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        m = len(nums) // 2
        if len(nums) % 2 == 0:
            a = (nums[m - 1] + nums[m]) / 2
        else:
            a = nums[m]
        return a

