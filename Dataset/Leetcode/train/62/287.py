 class Solution(object):
    def XXX(self, m, n):
        # 一维空间，其大小为 n
        dp = [1] * n
        for i in range(1, m):
            for j in range(1, n):
                # 等式右边的 dp[j]是上一次计算后的，加上左边的dp[j-1]即为当前结果
                dp[j] = dp[j] + dp[j - 1]
        return dp[-1]

作者：wang_ni_ma
链接：https://leetcode-cn.com/problems/unique-paths/solution/san-chong-shi-xian-xiang-xi-tu-jie-62-bu-4jz1/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

