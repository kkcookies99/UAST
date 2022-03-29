class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        rightmost = 0

        for i in range(n):
            if i > rightmost:
                return False
            rightmost = max(rightmost, nums[i]+i)
            if rightmost >= n-1:
                return True
        
        return False

