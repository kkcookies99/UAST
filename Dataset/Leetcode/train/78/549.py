 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[]
        lres=[]
        def sub(lres,nums):
            if nums==[]:
                res.append(lres)
                return 
            sub(lres+[nums[0]],nums[1:])
            sub(lres,nums[1:])
        sub(lres,nums)
        return res

