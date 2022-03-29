 class Solution:
    def XXX(self, nums: List[int]) -> int:
        i = 0
        n = len(nums)
        while(i<n-1):
            if nums[i] == nums[i+1]:
                nums.pop(i)
                n -= 1
            else:
                i += 1
        return n