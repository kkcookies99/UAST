 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        length = len(str(x))
        if length == 1:
            return True
        result=[str(x)[i]==str(x)[length-1-i] for i in range(length/2)]
        # print result
        if list(set(result))==[True]:
            return True
        return False

