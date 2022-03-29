class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if (height==None)|(len(height)<=1):
            return 0
        if len(height)==2:
            return min(height[0],height[-1])
        s = []
        i = 0
        j = len(height)-1
        while j-i>=1:
            s1 = (j-i)*min(height[i],height[j])
            s.append(s1)
            if height[i]<=height[j]:
                i+=1
            else:
                j-=1
        return max(s)

