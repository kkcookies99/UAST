class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0:
            return [[]]
        if len(nums)==1:
            return [[],nums]
        
        ans = self.XXX(nums[:-1])
        new = nums[-1]
        for an in self.XXX(nums[:-1]):
            an.append(new)
            ans.append(an)
        return ans

