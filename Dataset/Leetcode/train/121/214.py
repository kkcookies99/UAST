 class Solution:
    def XXX(self, prices: List[int]) -> int:
        m=0
        d=[0]
        for i in range(len(prices)-2,-1,-1):
            m=max(prices[i+1],m)
            d.append(m-prices[i])
        return max(d)

