 class Solution:
    def XXX(self, prices):
        if len(prices) < 1:
            raise ValueError("Invalid Input")

        minVal = float("INF")
        maxRes = 0

        for i in range(len(prices)):
            if prices[i] < minVal:
                minVal = prices[i]

            else:
                maxRes = max(maxRes, prices[i] - minVal)

        return maxRes

