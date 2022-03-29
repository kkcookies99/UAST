 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        length=len(nums)
        n=0
        m=length-1
        t=0
        while t<=m:
            if nums[t]==0:
                nums[t]=nums[n]
                nums[n]=0
                n+=1
            if nums[t]==2:
                nums[t]=nums[m]
                nums[m]=2
                m-=1
                t=t-1
            t+=1
        """
        a,b,c=0,0,0
        for x in nums:
            if x==0:
                a+=1
            if x==1:
                b+=1
            if x==2:
                c+=1
        nums[0:a]=[0]*a
        nums[a:b+a]=[1]*b
        nums[a+b:a+b+c]=[2]*c

