 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return False
        for i in range(len(nums)-1,0,-1):
            if nums[i] == nums[i-1]:
                nums.pop(i)
                i -= 1
        return len(nums)

