 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target not in nums:
            for no in range(len(nums)):
                if target<nums[no]:
                    return no
        if target not in nums:
            return len(nums)       
        return nums.index(target)

