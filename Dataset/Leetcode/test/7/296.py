class Solution(object):
    def XXX(self, x):
        str_x = str(x)
        # 判断是否存在负号
        t_x = (str_x[::-1]) if x>=0 else ('-'+ str_x[-1:0:-1])
        int_x = int(t_x)
        if int_x< (-2)**31 or int_x>(2**31 -1):
            return 0
        return int_x


