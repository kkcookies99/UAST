 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        # 动态规划: 基本思路：用两个变量，一个存储当前最大的收益，一个存储当前的最小值。用当前的卖出价值，减去前面的最小值，即为当前收益,随着遍历更新最大收益和最小值。空间复杂度比较好, O(l)，时间复杂度一般，应该是O(n)。
        n = len(prices)
        if n == 0:
            return 0
        max_ = 0  # 假定最大利润为0
        min_ = prices[0]  # 假定第一个值为最小值
        for i in range(1, n):
            v = prices[i]  # 当前值
            min_ = min(v, min_)  # 比较之前最小值和当前值，更新最小值
            t = v - min_  # 当前利润
            max_ = max(t, max_)  # 比较之前最大利润和当前利润，更新最大利润
        return max_

