 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return [[]]
        ans=[[]]
        for _ in range(len(nums)):
            ans = [i+[j] for i in ans for j in nums if j not in i]
        return ans

