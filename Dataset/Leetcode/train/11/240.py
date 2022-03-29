class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        lenHNum = len(height)
        lenH = lenHNum-1
        areamax = 0
        for i in range(lenHNum):
            if height[0] >= height[-1]:
                a = height[-1] * lenH
                height.pop(-1)
            elif height[0] < height[-1]:
                a = height[0] * lenH
                height.pop(0)

            if a > areamax:
                areamax = a
            lenH -= 1

        return areamax

