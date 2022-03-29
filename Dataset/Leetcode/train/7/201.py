class Solution:
    def XXX(self, x):
        """
        :xtype: int
        :rtype: int
        """
        if x >= 0:
            over_zero_result = int(str(x)[::-1])
            output = 0 if over_zero_result > (2**31 -1) else over_zero_result
            return output
        else:
            low_zero_result = int('-'+str(x)[1:][::-1])
            output = 0 if abs(low_zero_result) > (2**31) else low_zero_result
            return output

