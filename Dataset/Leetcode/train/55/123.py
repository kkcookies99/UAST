class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        if n == 1:
            return True
        for i in range(1, n):
            if(nums[n-1-i]+n-1-i >= n-1):
                return self.XXX(nums[:n-i])
        return False

