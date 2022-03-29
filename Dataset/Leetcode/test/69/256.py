class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        start = 1
        end = x
        while(start <= end):
            mid = start + (end - start)/2
            if (mid **2) == x:
                return mid
            elif (mid ** 2) < x:
                start = mid + 1
            elif (mid **2) > x:
                end = mid - 1
        return end


