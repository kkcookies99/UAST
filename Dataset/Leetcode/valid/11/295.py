class Solution:
    def XXX(self, height) -> int:
        max_ = 0
        l, r = 0, len(height) - 1
        if r == 1:
            return min(height[l], height[r])
        while r-l > 1:
            max_ = max(min(height[l], height[r])*(r-l), max_)
            if height[l] < height[r]:
                l += 1
            elif height[r] < height[l]:
                r -= 1
            else:
                if height[r-1] > height[l+1]:
                    r -= 1
                else:
                    l += 1
        return max(max_, min(height[r], height[l]))

