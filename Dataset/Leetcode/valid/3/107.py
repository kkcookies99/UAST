 class Solution:
    def XXX(self, s: str) -> int:
        dic={}
        for a in s:
            if a not in dic:
                dic[a]=0   
        if len(dic.values())==len(s):
            return len(s)
        if len(dic.values())==1:
            return 1
                     
        for i in range(len(dic.values()),1,-1):
            for j in range(0,len(s)):                  
                if i+j<=len(s):
                    s1=s[j:j+i]
                    dic1={}
                    for a in s1:
                        if a not in dic1:
                            dic1[a]=1
                        else:
                            break
                if len(dic1.values())==i:
                    return i
        return 0

