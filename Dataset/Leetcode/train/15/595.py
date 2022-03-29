 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        n=len(nums)
        res=[]
        if n<3 or nums[0]>0:
            return []
        for i in range(n-2):
            if i!=0 and nums[i]==nums[i-1]:
                continue
            j=i+1
            k=n-1
            while j<k:
                if -nums[i]==nums[j]+nums[k]:
                    res.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while j<k and nums[j]==nums[j-1]:
                        j+=1
                    while j<k and nums[k]==nums[k+1]:
                        k-=1
                elif -nums[i]>=nums[j]+nums[k]:
                    
                    j+=1
                else:
                    k-=1
                
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


