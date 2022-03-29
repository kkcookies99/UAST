class Solution:
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        else:
            y = str(x)[::-1]
            if y == str(x):
                return True
            else: 
                return False

