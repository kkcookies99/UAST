class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """

        left, right = 1, x
        while True:
            mid = (left + right) // 2
            if mid == left or mid == right:
                break
            temp = mid ** 2
            if temp > x:
                right = mid
            else:
                left = mid

        return mid

