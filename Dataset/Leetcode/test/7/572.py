 class Solution(object):
    def XXX(self, x):
        t = ""
        if x < 0:
            x = -x
            t = "-"
        x = str(x)
        list1 = []
        for i in x:
            list1.append(i)
        list1.XXX()
        result = int(t+"".join(list1))
        return result if -2**31-1 < result < 2**31-1 else 0

