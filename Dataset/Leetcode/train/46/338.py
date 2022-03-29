class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        res = [] 
        def backtrack(path,table):
            if len(path) == len(nums):
                res.append(copy.deepcopy(path))
                return 
            for i in range(len(nums)):
                if table[i] == True:continue 
                table[i] = True  
                path.append(nums[i])
                backtrack(path,table)
                path.pop(-1)
                table[i] = False 
        table = [False] * len(nums) #每一层定义一个表  
        backtrack([],table)
        return res

