 class Solution:
    def XXX(self, s: str) -> bool:
        d ={"{":"}","(":")","[":"]"}
        t = []
        for i in s:
            if i in d:
                t.append(i)
            else:
                if len(t)!=0 and d[t[-1]] == i:
                    t.pop()
                else:
                    return False
        if len(t) == 0:
            return True
        return False

