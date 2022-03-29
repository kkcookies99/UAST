 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0:
            return [[]]
        x = nums.pop(0)
        res = []
        s = self.XXX(nums)
        for each in s:
            res.append([x]+each)
            res.append(each)
        return res

