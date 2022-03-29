 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        ind = 0
        while ind < len(nums):
            if nums[ind]==val: nums.pop(ind)
            else:ind += 1

