class Solution:
    def XXX(self, nums: List[int]) -> bool:
        #第一种：自后向前
        '''
        if len(nums)<=1:
            return True
        pos=len(nums)-1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]+i>=pos:
                pos=i
        return pos==0
        '''
        #第二种：自前向后
        pos=nums[0]
        for i in range(len(nums)):
            if i>pos:
                return False
            pos=max(nums[i]+i,pos)
            if pos>=len(nums)-1:
                return True

