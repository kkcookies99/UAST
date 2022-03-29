 class Solution:
    def isPalindrome(self,s:str):
        i=0
        while(i<len(s)/2):
            if(s[i]==s[-1-i]):
                i=i+1
            else:
                return False
        return True
    def XXX(self, s: str) -> str:
        if(s==''):
            return s
        i=len(s);
        result=s
        str=s
        while(i>0):
            start=0;
            end=start+i;
            str = s[start:end]
            while(end<len(s)+1):
                if(self.isPalindrome(str)):
                    result=str;
                    return result;
                else:
                    start=start+1
                    end=start+i
                    str=s[start:end]
            i=i-1


