 class Solution:
    def XXX(self, nums, target):
        for i in range(0,len(nums)):            
            for j in range(i+1,len(nums)):
                if target-nums[i]==nums[j]:
                    list=[i,j]
                    print(list)

