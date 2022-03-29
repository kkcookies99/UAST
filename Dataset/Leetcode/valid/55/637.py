 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        if len(nums) <= 1:
            return True
        l = len(nums)
        for i in range(l-2, -1, -1):
            n = nums[i]
            if n == 0:
                for j in range(i-1, -1, -1):
                    if j+nums[j] > i:
                        return self.XXX(nums[:j+1])
                return False
        return True

