 class Solution:
    def XXX(self, s: str) -> int:
        a = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
        b = ['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I']
        ans = 0
        i = 0

        while i < len(s):
            if s[i:i+2] in b:
                ans += a[b.index(s[i:i+2])]
                i = i + 2
            else:
                ans += a[b.index(s[i:i+1])]
                i = i + 1
        return ans    

