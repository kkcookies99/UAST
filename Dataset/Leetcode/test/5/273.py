 def check(s) :
    if s==s[::-1] :
        return True
    else :
        return False
class Solution(object):
    def XXX(self, s):
        i=0
        maxs=''
        maxl=0
        validpos=0
        while i<len(s) :
            if len(s)-i <maxl :
                break
            end=i+1
            while end<len(s)+1 :
                if check(s[i:end])==True :
                    validpos=end
                end+=1
            tmp=s[i:validpos]
            if len(tmp)>maxl :
                maxs=tmp
                maxl=len(tmp)
            i+=1
        return maxs

