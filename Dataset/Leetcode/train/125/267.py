 class Solution:
    def XXX(self, s: str) -> bool:
        s1=''
        AZ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'
        for c in s:
            if  c in AZ :
                s1+=c.upper()
        if s1==s1[::-1]:
            return True
        else:
            return False

