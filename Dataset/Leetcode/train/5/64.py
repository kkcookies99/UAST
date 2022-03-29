 class Solution:
    def XXX(self, s: str) -> str:
        def same_detect():
                x = s[m]
                r = m
                l = m
                while r<len(s) and s[r]==x:
                    r+=1
                while 0<=l and s[l]==x:
                    l-=1
                return l, r
                
        l, m, r = 0, 1, 1
        flag = '00'
        length = 0
        if len(s)==0:
            return s
        if len(s)==1:
            return s
        res = s[0]
        while m<len(s):
            if 0<m<len(s)-1 and s[m-1]==s[m+1] and flag=='00':
                if s[m]==s[m-1]:
                    l, r = same_detect()
                else:
                    l = m-2
                    r = m+2
                flag = '01'
            elif s[m]==s[m-1] and flag=='00':
                l, r = same_detect()
                flag = '01'
            elif flag=='01':
                pass
            else:
                m += 1

            if flag=='01':
                if 0<=l<r and l<r<len(s) and s[l]==s[r]:
                    l -= 1
                    r += 1
                else:
                    if length<(r-l):
                        res = s[l+1:r]
                        length = r-l
                    flag = '00'
                    m += 1   
        return res

