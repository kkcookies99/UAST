 class Solution:
    def helper(self, nums:List[int], OneChoice: list, index:int):
        if index == len(nums):
            self.res.append(OneChoice.copy())
            return
        for i in range(len(nums)):
            if self.visited[i] == False:
                OneChoice.append(nums[i])
                self.visited[i] = True
                self.helper(nums,OneChoice,index+1)
                self.visited[i] = False
                OneChoice.pop()


    def XXX(self, nums: List[int]) -> List[List[int]]:
        self.visited=[False] * len(nums)
        self.res=[]
        self.helper(nums,[], 0)
        return self.res

