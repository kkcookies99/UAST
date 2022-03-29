class Solution:
    def XXX(self, n: int) -> int:
        nums=[]
        nums.append(1)
        nums.append(2)
        if n>2:
            for i in range(2,n,1):
                nums.append( nums[-1] + nums[-2] )
        return nums[n-1]

