 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 思路1：
        # 最低点买入，最高点卖出 -- 如果最低点在最后咋办，还是不行
        # 既然是序列问题，搞两个值，一个更新最小值，一个最大差值 时间N即可搞定
        lowest = prices[0]
        highest_income = 0
        for i_index,i in enumerate(prices[1:]):
            
            highest_income = max(i - lowest,highest_income)
            lowest = min(i,lowest)
     
        return highest_income 


