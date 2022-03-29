class Solution:
    def XXX(self, a: str, b: str) -> str:
        la = len(a)
        lb = len(b)

        def add(s1,s2):
            """
                len(s1) <= len(s2)
            """
            res = [0]*(len(s2)+1)
            c = 0
            for i in range(-1,-len(s1)-1,-1):
                s = int(s1[i]) + int(s2[i]) + c
                c = s//2
                res[i] = str(s % 2)

            for i in range(-len(s1)-1,-len(s2)-1,-1):
                s = int(s2[i]) + c
                c = s//2
                res[i] = str(s % 2)
            
            if c==0:
                res = res[1:]
            else:
                res[0] = '1'

            return "".join(res)

        if la<=lb:
            return add(a,b)
        else:
            return add(b,a)


