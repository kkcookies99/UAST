class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ret = [[]]
        for num in nums:
            for i in range(len(ret)):
                ret.append(ret[i] + [num])
        return ret

