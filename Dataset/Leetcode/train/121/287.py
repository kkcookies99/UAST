 class Solution:
    def XXX(self, prices: List[int]) -> int:
        """
            前i天的最大收益 = max(前i天最大收益，第i天-前i天最小价格)
        """
        max_price = 0
        min_price = prices[0]
        for idx,i in enumerate(prices[1:]):
            if min_price>i:
                min_price=i
            if max_price>=i:
                continue
            else:
                max_price = max(max_price,i-min_price)
        return max_price


