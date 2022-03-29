 class Solution:
    def XXX(self, s: str) -> int:
        dic={}
        maxlen=0
        last=-1
        for i,val in enumerate(s):
            if val in dic and dic[val]>last:
                last=dic[val]
            maxlen=max(maxlen,i-last)
            dic[val]=i
        return(maxlen)

