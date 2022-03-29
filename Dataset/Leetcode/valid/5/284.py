 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        slen= len(s)
        l ={'sub':""}
        if slen==1:
            return s
        if slen==0:
            return ""
        for i in range(slen):
            
            for j in range(slen):
                t1 = s[i:(slen-j)]
                r1 = t1[::-1]
                
                if t1 in r1 :
                    if len(t1) > slen*0.5:
                        return t1
                    
                    if len(t1)>= len(l["sub"]):
                        l["sub"]=t1
               
        return l["sub"]

