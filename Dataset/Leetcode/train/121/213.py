 class Solution:
    def XXX(self, prices: List[int]) -> int:
        d=[0]
        for i in range(len(prices)-1):
            d.append(max(prices[i+1:])-prices[i])
        return max(d)

