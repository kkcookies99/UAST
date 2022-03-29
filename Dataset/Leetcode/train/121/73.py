 class Solution:
    def XXX(self, prices: List[int]) -> int:
        _min, _max = prices[0], 0
        for i in range(len(prices)):
            _min = min(_min, prices[i])
            _max = max(_max, prices[i] - _min)

        return _max

