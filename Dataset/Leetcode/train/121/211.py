 class Solution:
    def XXX(self, prices: List[int]) -> int:
        minprice = prices[0]
        maxprofit = 0

        if len(prices) == 1:
            return 0

        else:
            for i in range(len(prices) - 1):
                # 比较当日和次日股价，仅股价跌落时传参，无(跳)视(过)持续走高之股价
                if prices[i] > prices[i + 1]:
                    maxprofit = max(maxprofit, prices[i] - minprice)
                    minprice = min(prices[i + 1], minprice)
            return max(maxprofit, prices[-1] - minprice)

