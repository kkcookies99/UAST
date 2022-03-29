class Solution:
    def XXX(self, prices: List[int]) -> int:
        prices.reverse()
        m = prices[0]
        prices[0] = 0
        for i in range(1,len(prices)):
            if prices[i] >= m:  #更新最高卖出价
                m = prices[i]
                prices[i] = 0
            else:
                prices[i] = m - prices[i]  #当前能获利最多
        return max(prices)

