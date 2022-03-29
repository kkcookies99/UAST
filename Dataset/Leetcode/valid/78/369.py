class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        for n in range(1 << len(nums)):
            tmp = []
            for i in range(len(nums)):
                if n & 1: tmp.append(nums[i])
                n = n >> 1
                if n == 0: break
            res.append(tmp)
        return res

