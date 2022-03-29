class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ret = []
        if len(nums) == 1:
            return [nums]
        for i, num in enumerate(nums):
            sonRet = self.XXX(nums[:i]+nums[i+1:])
            for remainResult in sonRet:
                ret.append([num]+remainResult)
        return ret

