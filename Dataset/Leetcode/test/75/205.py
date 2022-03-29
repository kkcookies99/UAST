class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r ,w,b=0,0,0
        for i in nums:
            if i ==0:
                r+=1
            if i==1:
                w +=1
            if i==2:
                b+=1
        ans = [0]*r+[1]*w+[2]*b
        nums[:]=ans[:]


