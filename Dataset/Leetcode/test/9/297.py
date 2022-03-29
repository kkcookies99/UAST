class Solution(object):
    def XXX(self, x):
        x=str(x)
        num=len(x)
        for i in range(len(x)//2):
            if x[i]!=x[len(x)-1-i]:
                return False
        return True
