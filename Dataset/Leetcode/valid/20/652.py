 class Solution:
    def XXX(self, s: str) -> bool:
        t_a = ["()","[]","{}"]
        if len(s)==1:
            return False
        s = list(s)
        i = 0
        while True:
            if i>=0 and i<len(s)-1:
                temp = ''.join([s[i],s[i+1]])
                if temp in t_a:
                    del s[i:i+2]
                    if not s:
                        return True
                    i -= 2
            if i>len(s):
                return False
            i += 1

