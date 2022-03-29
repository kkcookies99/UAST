 class Solution:
    class Status:
        def __init__(self, min_index, max_index, profit):
            self.min_index = min_index
            self.max_index = max_index
            self.profit = profit

    def max_profit(self, prices: List[int], l_index: int, r_index: int) -> Status:
        if l_index == r_index:
            return self.Status(l_index, r_index, 0)

        m_index = (l_index + r_index) // 2
        l_status = self.max_profit(prices, l_index, m_index)
        r_status = self.max_profit(prices, m_index+1, r_index)
        profit = max(l_status.profit, r_status.profit,\
                     prices[r_status.max_index] - prices[l_status.min_index])
        max_index = r_status.max_index 
        if prices[l_status.max_index] > prices[r_status.max_index]:
             max_index = l_status.max_index
        
        min_index = l_status.min_index 
        if prices[l_status.min_index] > prices[r_status.min_index]:
             min_index = r_status.min_index 

        return self.Status(min_index, max_index, profit)

    def XXX(self, prices: List[int]) -> int:
        l_index = 0
        h_index = len(prices) - 1
        return self.max_profit(prices, l_index, h_index).profit

