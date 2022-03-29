class Solution(object):
    def XXX(self, s):
        l=['IV','IX','XL','XC','CD','CM']
        l0=['I','V','X','L','C','D','M']
        map={'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900,
               'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        tot=0
        for i in l:
            if i in s:
                tot=tot+map[i]
                s=s.replace(i,'')         
        s=''.join(s)
        str=[]
        for i in s:
            str.append(i)
        for i in str:
            if i in l0:
                tot =tot+map[i]
        return tot

