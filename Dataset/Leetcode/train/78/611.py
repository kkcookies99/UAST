 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [[nums[0]],[]]
        a = self.XXX(nums[1:])
        return a+[[nums[0]]+i for i in a]

