 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        nums1, nums = nums, sorted(nums)
        i, j = 0, len(nums)-1
        while i < j:
            if nums[i] + nums[j] < target: i += 1
            elif nums[i] + nums[j] > target: j -= 1
            else: 
                m, n = nums1.index(nums[i]),  nums1.index(nums[j])
                return [m, n] if nums[i] != nums[j] else [m, nums1.index(nums[j], m+1)]

