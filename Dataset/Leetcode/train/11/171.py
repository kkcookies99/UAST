class Solution:
    def XXX(self, height: List[int]) -> int:
        n = len(height)
        l = 0
        r = n - 1
        res = []
        while l <= r:
            if height[l] <= height[r]:
                res.append(height[l]*(r-l))
                l = l + 1
            else:
                res.append(height[r]*(r-l))
                r = r - 1
        return max(res)

