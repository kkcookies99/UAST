 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 预处理，寻找当前索引右边的最大值
        rightmax = [-1] * len(prices)
        # 初始化
        rightmax[-1] = prices[-1]
        if len(prices) == 1:
            return 0
        for i in range(len(prices)-2, -1, -1):
            rightmax[i] = max(rightmax[i+1], prices[i])
        #print(rightmax)
        maxans = 0
        for i in range(len(prices)):
            maxans = max(maxans, rightmax[i] - prices[i])
        return maxans

