class Solution:
    def XXX(self, nums: List[int]) -> bool:
        pos=len(nums)-1
        while pos>0:
            pre=pos-1
            while pre>=0:
                if nums[pre]+pre>=pos:
                    pos=pre
                    break
                else:
                    pre-=1
                if pre<0:
                    return False
        return pos<=0

