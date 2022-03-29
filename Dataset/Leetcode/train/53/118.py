class Solution:
    def XXX(self, nums: List[int]) -> int: 
        n = len(nums)
        m = nums[0]
        ret = m
        
        for i in range(1, n):
            m = max(nums[i], m + nums[i])
            ret = max(ret, m)
            

        return ret
        

