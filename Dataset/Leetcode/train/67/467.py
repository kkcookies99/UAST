class Solution:
    def XXX(self, a: str, b: str) -> str:
        maxlen=max(len(a),len(b))
        a=a.zfill(maxlen)
        b=b.zfill(maxlen)

        res=[0]*(maxlen+1)
        nice = False
        for i in range(-1,-maxlen-1,-1):
            first=int(a[i])+int(b[i])
            if nice:
                first+=1
            if first>=2:
                first-=2
                nice = True
            else:
                nice = False
            res[i]=str(first)
            if i == -maxlen:
                if nice:
                    res[i-1]='1'
                else:
                    res[i-1]='0'
        res = ''.join(res)
        if res[0]=='0':
            res=res[1:]
        return res


