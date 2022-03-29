class Solution(object):
    def XXX(self, n):
        s = '1'
        for i in range(1,n):
            s1 = ""
            j = 0
            while j < len(s):
                cnt = 1
                t = j+1
                while t < len(s):
                    if s[t] == s[j]:
                        cnt+=1
                    else:
                        break
                    t += 1
                s1 += str(cnt) + s[j]
                if t == len(s): break
                j = t
            s = s1
        return s

