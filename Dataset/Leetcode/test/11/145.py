class Solution:
    def XXX(self, height: [int]) -> int:
        area = 0
        y = len(height)-1
        x = 0
        while x != y:
            a = min(height[y],height[x]) * abs(x-y)
            if a > area:
                area = a
            if height[x] < height[y]:
                x += 1
            else:
                y -= 1               
        return area

