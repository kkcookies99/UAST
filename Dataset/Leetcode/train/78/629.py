 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = [[]]
        for i in nums:
            for j in range(len(ans)):
                ans.append(ans[j]+[i])
        return ans

