class Solution:
    def XXX(self, x: int) -> int:

        if x==1:
            return 1
        
        left = 0
        right = x
        # 因为x是整数，所求的因子也要求是整数
        # 所以可以使用right-left > 1来作为while条件
        # 当right-left等于1时，left即为所求的答案
        while right-left > 1:
            mid = int((left+right)/2)
            if mid*mid <= x:
                left = mid
            else:
                right = mid
        
        return left

