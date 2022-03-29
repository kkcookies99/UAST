 class Solution:
    def XXX(self, s: str) -> str:
        if s=="":
            return ""

        res=1
        res_s=s[0]
        #单核
        for i in range(len(s)):
            left=i
            right=i
            length=-1
            while left>=0 and right<=len(s)-1:
                if s[left]==s[right]:
                    length+=2
                    if length>res:
                        res=length
                        res_s=s[left:right+1]
                else:
                    break
                left-=1
                right+=1
        #双核
        for i in range(len(s)-1):
            if s[i]==s[i+1]:
                left=i
                right=i+1
                length=0
                while left>=0 and right<=len(s)-1:
                    if s[left]==s[right]:
                        length+=2
                        if length>res:
                            res=length
                            res_s=s[left:right+1]
                    else:
                        break
                    left-=1
                    right+=1
                

        return res_s

