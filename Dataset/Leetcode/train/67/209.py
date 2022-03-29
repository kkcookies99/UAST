 class Solution:
    def XXX(self, a: str, b: str) -> str:
        temp = 0
        l = max(len(a),len(b))
        a ,b = a.rjust(l,'0'),b.rjust(l,'0')
        for i in range(l-1,-1,-1):
            if i == l - min(len(a),len(b))-2:return a
            kk = int(a[i])+int(b[i])+temp
            if kk >= 2:
                temp = 1
                a = a[:i]+str(kk%2)+a[i+1:]
            else:
                a = a[:i]+str(kk)+a[i+1:]
                temp = 0
        if temp==1: a = '1'+a
        return a

