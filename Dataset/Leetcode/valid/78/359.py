class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        def helper(n):
            if n == 0:
                return [[], [nums[0]]]
            
            ans = []
            ret = helper(n-1)
            for i in range(len(ret)):
                ans.append(ret[i] + [nums[n]])

            return ans + ret
        
        return helper(len(nums) - 1)

