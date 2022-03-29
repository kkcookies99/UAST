 class Solution:
    def XXX(self, nums: int) -> List[List[int]]:
        dicts={}
        def aaaa(nums):
            if nums in dicts:
                return dicts[nums]
            res=[]
            if nums==1:
                res=[1]
            elif nums==2:
                res=[1,1]
            else:
                res=[1]+[sum(aaaa(nums-1)[i-1:i+1]) for i in range(1,nums-1)]+[1]
            dicts[nums]=res
            return res
        return [aaaa(i+1) for i in range(nums)]

