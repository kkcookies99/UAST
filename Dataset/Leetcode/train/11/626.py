 class Solution(object):
    def XXX(self, height):
        i, j = 0, len(height) - 1
        max_value = min(height[i], height[j]) * (j - i)
        while i < j:
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
            if min(height[i], height[j]) * (j - i) > max_value:
                max_value = min(height[i], height[j]) * (j - i)
        return max_value

