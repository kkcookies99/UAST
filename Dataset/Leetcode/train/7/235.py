class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
         flag = 0
        if x < -2**31 or x > 2**31 - 1:
            return 0
        else:
            s = str(x)
            if s[0] == '-':
                s = s.lstrip('-')
                flag = 1

            s = s[::-1]  # 反转
            s = s.lstrip('0')

            x = int(s,10)
            
            if flag==1:
                return -x
            else:
                return x

