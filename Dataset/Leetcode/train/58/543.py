class Solution:
    def XXX(self, s: str) -> int:
        if s=='' :return 0
        len1=0
        b=s[::-1]
        for i in range (len(s)):
            if b[i]==" "  and len1!=0 : return len1
            elif b[i]!=" " :
                len1=len1+1
        return len1


