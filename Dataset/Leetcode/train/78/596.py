 class Solution:
    def __init__(self):
        self.path=None
        self.result=[]
    def XXX(self, nums: List[int]) -> List[List[int]]:
        self.path=[0 for i in range(len(nums))]
        self.search(0,nums)
        return self.result
        
    def search(self,idx,nums):
        if idx>=len(nums):
            temp=[]
            for i in range(len(nums)):
                if self.path[i]==1:
                    temp.append(nums[i])
            self.result.append(temp)
            return
        
        for ele in [0,1]:
            self.path[idx]=ele
            self.search(idx+1,nums)
                    

