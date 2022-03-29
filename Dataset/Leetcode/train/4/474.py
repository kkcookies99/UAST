 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        mid_id = int(len(nums)/2)
        return nums[mid_id] if len(nums) % 2 else nums[mid_id]/2 + nums[mid_id-1]/2

