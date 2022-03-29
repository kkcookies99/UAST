class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [[], nums]   
        return self.XXX(nums[1:]) + [[nums[0]] + x for x in self.XXX(nums[1:])]

