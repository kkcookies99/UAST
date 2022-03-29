 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        max_p=0
        for i in range(len(nums)):
            if max_p<i:
                return False
            max_p=max(max_p,nums[i]+i)
        return True

