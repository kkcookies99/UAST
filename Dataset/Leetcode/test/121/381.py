 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 动态规划
        min_num = max(prices)
        amount = 0
        for p in prices:
            if p < min_num:
                min_num = p
            elif p-min_num > amount:
                amount = p - min_num
        return amount

