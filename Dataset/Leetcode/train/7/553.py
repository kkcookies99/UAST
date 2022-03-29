 class Solution:
    def XXX(self, x: int) -> int:
        x = str(x);
        if x[0].isdigit():
            x = x[::-1];
            x = int(x);
            if -2**31< x < 2**31 - 1:
                return x;
            else:
                return 0;
        else:
            y = x[1:];
            y = y[::-1];
            y = int(y);
            if -2**31< y < 2**31 - 1:
                return -y;
            else:
                return 0;

