class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1: return [nums]
        ans = []
        for index, num in enumerate(nums):
            for item in self.XXX(nums[:index] + nums[index + 1:]):
                ans.append([num] + item)
        return ans

