 class Solution:
    def XXX(self, prices: List[int]) -> int:

        XXX = 0
        buy = prices[0]
        for i in range(1, len(prices)):
            sell = prices[i]
            # 當賣價大於買價時, 紀錄最大值
            if sell > buy:
                profit = sell - buy
                if profit > XXX:
                    XXX = profit
            # 當買價大於賣價時, 則重新記錄買價
            else:
                buy = sell
        return XXX

