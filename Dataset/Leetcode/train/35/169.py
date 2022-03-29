 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target > nums[-1]:
            return len(nums)
        elif target < nums[0]:
            return 0
        j = 0
        for i in nums:
            if target == i or target < i:
                return j
            j+=1

