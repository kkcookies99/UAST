 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        if len(nums)>2:
            for i in range(len(nums)-2):
                if i>0 and nums[i]==nums[i-1]:
                    continue
                j=i+1
                k=len(nums)-1
                while j<k:
                    while k>j and k<len(nums)-1 and nums[k]==nums[k+1]:
                        k-=1
                    while j<k and j>i+1 and nums[j]==nums[j-1]:
                        j+=1
                    if j>=k:
                        break
                    if nums[i]+nums[k]+nums[j]==0:
                        res.append([nums[i],nums[j],nums[k]])
                    elif nums[i]+nums[k]+nums[j]>0:
                        k-=1
                    else:
                        j+=1
        return res

