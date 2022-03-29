class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = []
        for i in range(len(nums)+1):
            ans.extend(combinations(nums,i))
        return ans

