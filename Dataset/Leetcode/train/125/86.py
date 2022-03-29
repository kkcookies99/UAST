 class Solution:
    def XXX(self, s: str) -> bool:
        s1=''.join(e for e in s if e.isalnum()) #只保留数字和字母
        s2=s1.lower()    #变为小写
        start=0
        end=len(s2)-1
        while start<end:
            if  s2[start]==s2[end]:
                start+=1
                end-=1
            else:
                return False
        return True

