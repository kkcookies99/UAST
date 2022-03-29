 class Solution:
    def XXX(self, s: str) -> bool:
        for i in range(len(s)):
            if '()' in s:
                s=s.replace('()','')
            if '[]' in s:
                s=s.replace('[]','')
            if '{}' in s:
                s=s.replace('{}','')
        return len(s)==0
        

