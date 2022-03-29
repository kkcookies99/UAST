class Solution:
    def XXX(self, nums: List[int]) -> bool:
        nextdis = 0
        curdis = 0
        for i in range(len(nums)):
            nextdis = max(i+nums[i], nextdis)
            if i==curdis:
                curdis = nextdis
                if nextdis >= len(nums)-1:
                    return True
        return False

