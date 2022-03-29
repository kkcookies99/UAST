class Solution:
    def XXX(self, nums: List[int]) -> bool:
        l,maxp,end=len(nums),0,0
        for i in range(l-1):
            if maxp>=i:
                maxp=max(maxp,i+nums[i])
                if i==end:
                    end=maxp
        if maxp>=l-1:
            return True
        else:
            return False

