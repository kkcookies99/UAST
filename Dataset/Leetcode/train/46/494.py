 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = list()
        if nums == []: return [[]]
        if len(nums) == 1:
            ans.append(nums)

        for i, num in enumerate(nums):
            a = [m for n,m in enumerate(nums) if n != i]
            if a == []:
                break
            res = self.XXX(a)
            for e in res:
                c = [nums[i]] + e
                ans.append(c)
        return ans

