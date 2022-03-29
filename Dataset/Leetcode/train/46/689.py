 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return [[]]
        ans=[]
        for i in range(len(nums)):
            for prev in self.XXX(nums[:i]+nums[i+1:]):
                ans.append(prev+[nums[i]])
        return ans

