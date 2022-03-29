 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        i = 0
        while i < len(nums):
            while nums[i] == val:
                nums.pop(i)
                if i >= len(nums):
                    break
            i = i + 1
        return i

