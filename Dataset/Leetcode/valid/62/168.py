 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        #nums = [[0]*n]*m  错误初始化方式
        nums = [[0 for i in range(n)] for j in range(m)]
        for i in range(m):
            for j in range(n):
                if i == 0 and j == 0:
                    nums[i][j]=1
                    continue
                elif i == 0:
                    nums[i][j] = nums[i][j-1]
                elif j == 0:
                    nums[i][j] = nums[i-1][j]
                else:
                    nums[i][j] = nums[i-1][j]+nums[i][j-1]
        return nums[i][j]

