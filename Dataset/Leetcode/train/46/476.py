 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [nums]
        res, length = [], len(nums)
        for items in self.XXX(nums[1:]):
            for i in range(length):
                res.append(items[:i] + [nums[0]] + items[i:])
        return res

