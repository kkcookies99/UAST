 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if prices.__len__() == 0: return 0
        ret = 0
        pre = 1e4

        for i in range(0, len(prices)):
            if prices[i] < pre:
                pre = prices[i]
            else:
                ret = max(ret, prices[i] - pre)

        return ret




