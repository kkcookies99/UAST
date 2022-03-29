 class Solution(object):
    def XXX(self, s):
        a = s.split(" ")
        x = len(a)   
        if a[-1]:
            l = len(a[-1]) 
        else:
            a.reverse()
            for i in a:
                if len(i) != 0:
                    l = len(i)
                    break
                else:
                    l = 0
                    continue
        return l

