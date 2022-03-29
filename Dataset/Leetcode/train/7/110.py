class Solution(object):
    def XXX(self, x):
        if x >= 0:
            x = str(x)
            x = x[::-1]
        else:
            x = str(x)
            x = x[1:]
            x = '-' + x[::-1]
        x = float(x)
        if (x < float(-2 << 30)) | (x >= float(2 << 30)):
            return 0
        x = int(x)
        return x

