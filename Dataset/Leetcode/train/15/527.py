 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
 
        unique=[]
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if (nums[i]+nums[j]+nums[k]==0):
                        result.append(sorted([nums[i],nums[j],nums[k]]))
        for num in result:
            if (num not in unique):
                unique.append(num) 
    
        return sorted(unique)

