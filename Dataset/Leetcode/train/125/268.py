 class Solution:
    def XXX(self, s: str) -> bool:
        s1=''
        AZ='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
        az='abcdefghijklmnopqrstuvwxyz'
        sz='0123456789'
        for c in s:
            if c in az or c in AZ or c in sz:
                s1+=c.upper()
        if s1==s1[::-1]:
            return True
        else:
            return False

