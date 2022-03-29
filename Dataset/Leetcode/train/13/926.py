 class Solution:
   def XXX(self, s: str) -> int:
        result=0
        dict={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        for i in range(len(s)):
            result+=dict[s[i]]
            if i>=1:
                if dict[s[i]]>dict[s[i-1]]:
                    result+=(-dict[s[i-1]]-dict[s[i]]+(dict[s[i]]-dict[s[i-1]]))
        return result


