class Solution(object):
    def XXX(self, x):
        flag = 0 if x>=0 else 1
        x = str(abs(x))
        y = x[::-1]
        int_y = int(y) if flag==0 else -int(y)
        return int_y if int_y<=pow(2, 31)-1 and int_y>=-pow(2,31) else 0

