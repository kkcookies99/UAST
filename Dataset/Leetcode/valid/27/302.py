 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        low, fast = 0, 0
        while fast<len(nums):
            if nums[fast]==val:
                fast+=1
            else:
                nums[low]=nums[fast]
                low+=1
                fast+=1
        return low

