class Solution:
    def XXX(self, x: int) -> int:
        # 找到ans，满足ans**2<=x<(ans+1)**2，ans起始范围为[0,x]
        # step 1: 确定初始left, right 
        left,right = 0,x

        # step 2: 确定mid；判断ans**2<=x<(ans+1)**2
        #         如果不满足条件：ans**2大于x，切掉右半边；反之
        #         结束条件为left>right
        while left<=right:
            mid = (left+right)//2 
            if mid**2<=x<(mid+1)**2:
                return mid 
            elif mid**2>x:
                right = mid-1 
            else:  # (mid+1)**2<=x
                left = mid+1

