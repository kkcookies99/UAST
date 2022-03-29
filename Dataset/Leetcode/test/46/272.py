class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        t = []
        def bf(nums):
            if len(t) == len(nums):
                res.append([_ for _ in t])
                return
            for i in nums:
                if i not in t:
                    t.append(i)
                    bf(nums)
                    t.pop()
        bf(nums)
        return res


