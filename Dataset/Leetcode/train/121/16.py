 class Solution:
    def XXX(self, prices: List[int]) -> int:
        low = float("inf")
        result = 0
        for i in range(len(prices)):
            low = min(low, prices[i]) #取最左最小价格
            result = max(result, prices[i] - low) #直接取最大区间利润
        return result

