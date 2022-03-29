 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 只能卖一次
        min_=prices[0]    # 记录前i-1个元素的最小值 和当前i比较
        max_=0
        for i in range(1,len(prices)):
            max_ = max(prices[i]-min_,max_)
            min_ = min(min_,prices[i])

        return max_

