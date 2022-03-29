 class Solution:
    def XXX(self, s: str) -> int:
        s=s+" "
        values=[1000,500,100,50,10,5,1]
        roman=['M','D','C','L','X','V','I']
        num=0
        for j in range(len(s)):
            for i in range(len(values)):
                if s[j]==roman[i]:
                    num+=values[i]
                else:
                    continue
                if (s[j]=='C' and s[j+1]=='M') or (s[j]=='C' and s[j+1]=='D'):
                    num=num-200
                if (s[j]=='X' and s[j+1]=='C') or (s[j]=='X'and s[j+1]=='L'):
                    num=num-20
                if (s[j]=='I' and s[j+1]=='V') or (s[j]=='I'and s[j+1]=='X'):
                    num=num-2
        return num

