class Solution:
    def XXX(self, x: int) -> int:
        #0直接返回
        if x == 0:
            return 0
        i = 1
        #需要求平方根的数字如果落在相邻的两个数字的平方组成的区间内，则满足要求
        while i > 0:
            if (i-1)**2 < x and x < (i+1)**2:
                return i
            else:
                i += 1```

