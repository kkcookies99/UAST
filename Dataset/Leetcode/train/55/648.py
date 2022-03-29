 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        if len(nums) <= 1: return True
        i, reach = 0, 0
        while i < len(nums):
            tmp = i + nums[i]
            if tmp == len(nums)-1:
                return True
            if tmp > reach:
                reach = tmp
            i+=1
            if i > reach:
                return False
        return True

