class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        x_str = list(XXXd(str(x)))
        if x_str[-1] == "-":
            x_str.pop()
            res = int("-"+"".join(x_str))
            if res < -pow(2,31):
                return 0
            else:
                return res
        else:
            res = int("".join(x_str))
            if res > pow(2,31)-1:
                return 0 
            else:
                return res

