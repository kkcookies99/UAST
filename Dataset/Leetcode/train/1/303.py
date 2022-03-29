 class Solution:
    def XXX(self, nums, target):
        for index1,x in enumerate(nums):
            for index2,y in enumerate(nums[index1+1:]):
                if x+y==target:
                    return [index1,index2+len(nums[:index1+1])]

