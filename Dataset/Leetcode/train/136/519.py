 class Solution:
    def singleNumber(self, nums):
        result = {}
        for i in set(nums):
            result[i] = nums.count(i)
        ans = min(result,key=result.get)
        return ans

