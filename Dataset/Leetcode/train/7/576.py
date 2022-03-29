 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        arr = list(str(x))
        new_str = ''
        for _ in range(len(arr)):
             new_str += arr.pop()
        try:
            result = int(new_str)
        except:
            result = 0-int(new_str[:-1])
        return result if -2**31 < result < 2**31 - 1 else 0

