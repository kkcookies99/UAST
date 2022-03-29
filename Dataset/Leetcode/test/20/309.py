 class Solution:
    def XXX (self,str):
        a = ['(', '[', '{']
        b = [')', ']', '}']
        s = []
        for i in str:
            if i in a:
                s.append(i)
            elif i in b:
                if a[b.index(i)] not in s:
                    return False
                elif a[b.index(i)] == s[-1]:
                    s.pop()
                else:
                    return False
        if len(s) == 0:
            return True
        else:
            return False

