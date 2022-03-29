class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        self.res=[]
        self.helper(nums,[])
        return self.res

    def helper(self,nums,temp):
        self.res.append(temp)
        for i in range(len(nums)):
            self.helper(nums[i+1:],temp+[nums[i]])

