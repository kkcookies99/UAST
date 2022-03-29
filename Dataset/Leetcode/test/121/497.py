 class Solution:
    def XXX(self, prices: List[int]) -> int:
        max_output = 0
        min_input = prices[0]
        for i in prices:
            max_output = max(i-min_input, max_output)
            min_input = min(i, min_input)
        return max_output


