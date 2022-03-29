 class Solution:
    def XXX(self, prices: List[int]) -> int:
        tmp = prices[:1]
        result = 0
        for i in range(1, len(prices)):
            tmp.append(min(prices[i], tmp[i-1]))
            result = max(result, prices[i]-tmp[i])
        return result

