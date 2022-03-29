 class Solution:
    def XXX(self, prices: List[int]) -> int:
        min_price,ans = 1e10,0,
        for p in prices:
            min_price = min(min_price,p)
            ans = max(ans,p-min_price)
        return ans

