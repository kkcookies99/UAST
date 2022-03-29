class Solution(object):
    def XXX(self, nums):
        result=[]
        res=[0 for i in range(3)]
        for i in range(len(nums)):
            index=nums[i]
            res[index]+=1
        for i in range(3):
            result=result+res[i]*[i]
        nums[:]=result

