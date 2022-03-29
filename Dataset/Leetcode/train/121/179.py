 class Solution:
    def XXX(self, prices: List[int]) -> int:
        num=0
        a=[0]
        for i in range(1,len(prices)):
            if prices[i]-prices[i-1]+num<0:
                num=0
            elif prices[i]-prices[i-1]+num>=0:
                num=prices[i]-prices[i-1]+num
                a.append(num)
        return max(a)
