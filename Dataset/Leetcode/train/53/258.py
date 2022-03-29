class Solution:
    def XXX(self, nums: List[int]) -> int:
        ans = float('-inf')
        if len(nums)<2:
            return nums[-1]
        for L in range(1,len(nums)+1):
            for l in range(len(nums)):
                r = l + L
                if r>len(nums):
                    break
                total = sum(nums[l:r])
                ans = max(ans, total)
        return ans

