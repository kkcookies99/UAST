class Solution:
    def XXX(self, nums: List[int]) -> int:
        a = []
        for i in range(len(nums)):
            for j in range(i+1):
                a.append(sum(nums[j:i+1]))         
        return max(a)

