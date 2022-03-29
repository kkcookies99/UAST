 class Solution:
    def XXX(self, prices: List[int]) -> int:
        n = len(prices)
        maichu = 0
        mairu = -float('inf')

        for i in range(1, n+1):
            maichu = max(maichu, mairu + prices[i-1]) #
            # 只有一次买入
            mairu = max(mairu, -prices[i-1])

        return maichu

