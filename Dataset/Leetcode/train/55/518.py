 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        max_jump = nums[0]
        for i, num in enumerate(nums):
            if num != 0:
                if max_jump-i <= num:
                    max_jump = num+i
            else:
                if max_jump <= i and i != len(nums)-1:
                    return False
        return True


