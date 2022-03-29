 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if len(prices)<2:
            return 0
        min = prices[0]
        max= prices[0]
        ans = 0
        for i in range(1,len(prices)):
            if min>prices[i] :
                min = prices[i]
                max = 0
            elif max<prices[i] :
                max = prices[i]
            else:
                pass

            if max-min >ans:
                ans = max-min
        return ans

