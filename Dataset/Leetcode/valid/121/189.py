 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if len(prices) == 0:
            return 0
        res = 0   # 最大收益
        minprice = prices[0]   # i位置之前的最小值
        for i in range(1, len(prices)):
            res = max(res, prices[i] - minprice)     # 当前最大收益，等于之前最大收益，与当前值与之前最小值之差两个值的最大值 
            minprice = min(minprice, prices[i])
        return res

