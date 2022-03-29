class Solution:
    def XXX(self, nums: List[int]) -> bool:

        boundary = 0
        for i in range(len(nums)):
            if i <= boundary:
                boundary = max(boundary, i + nums[i])
            else:
                return False
        
        return True

