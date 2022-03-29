class Solution(object):
    def XXX(self, height):
        m,i,j = 0, 0, len(height)-1
        while i != j:
            m = max(m, min(height[i],height[j])*(j-i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return m

