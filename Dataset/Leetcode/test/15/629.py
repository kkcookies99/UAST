 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        lens=len(nums)
        res=[]
        for i in range(lens):
            left=i+1
            right=lens-1
            while left<right:
                sum=nums[i]+nums[left]+nums[right]
                arr=[]
                if sum==0:
                    arr+=[nums[i],nums[left],nums[right]]
                    if arr!=[] and (arr not in res):#判断是否重复
                        res.append(arr)
                    left+=1
                    right-=1
                elif sum>0:
                    right-=1
                else:
                    left+=1
        return res

