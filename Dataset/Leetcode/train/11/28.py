class Solution:
    def XXX(self, height: List[int]) -> int:
        i =  0
        n = len(height)
        j = n-1
        max = 0

        while i != j:
            m = min(height[i],height[j])
            area = (j-i)*m
            if area > max:
                max = area
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return max```

