 class Solution(object):
    def XXX(self, prices):
        a=0
        sum = 0
        if len(prices) < 2:
            return 0
        else:
            for i in range(len(prices)-1):
                a = prices[i+1]-prices[i]
                if a > 0:
                    sum += a
        return sum

