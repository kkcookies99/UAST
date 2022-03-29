 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # t1: 买入价格，t2: 卖出价格
        t1 = t2 = 0
        res = 0
        for t in range(len(prices)):
            if prices[t] > prices[t2]:
                res = max(prices[t] - prices[t1], res)
            elif prices[t1] <= prices[t] <= prices[t2]:
                continue
            else:
                # 抄底时机
                t1 = t2 = t
        return res

