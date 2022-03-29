 class Solution:
    def XXX(self, prices):
        maxP = 0
        minPrices = float("INF")   # 记录遍历过的最小价格

        for each in prices:
            if each - minPrices > maxP:
                maxP = each - minPrices

            if each < minPrices:
                minPrices = each

        return maxP

