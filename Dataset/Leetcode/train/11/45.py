class Solution:
    def XXX(self, height: List[int]) -> int:
        num = len(height)
        x, y = 0, num - 1
        max_num = 0
        while x < y:
            result = (y - x) * min(height[x],height[y])
            if max_num < result:
                max_num = result
            if height[x] > height[y]:
                y -= 1
            else:
                x += 1
        return max_num

