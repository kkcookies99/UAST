class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[]
        if len(nums)==1:
            return [[],nums]
        for i in range(len(nums)):
            if i==0:
                res.append([nums[i]])
            else:
                subset=[]
                subset.append([nums[i]])
                for j in res:
                    subset.append(j+[nums[i]])
                res+=subset
        res.append([])
        return res


