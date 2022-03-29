 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if not nums:
            return 0
        left = 0
        right = len(nums)
        while True:
            m = (left+right)//2
            l,r = left,right
            if nums[m]==target:
                return m
            elif target>nums[m]:
                left = m
            else:
                right = m
            if l==left and r==right:
                if l==r and l==0:
                    return l
                return l+1

