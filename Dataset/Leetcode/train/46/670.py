 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def helper(cur, rest):
            if len(cur) == len(nums):
                res.append(cur[:])
            for i in range(len(rest)):
                cur.append(rest.pop(i))
                helper(cur, rest)
                rest.insert(i, cur.pop())
        res = []
        helper([], nums[:])
        return res

