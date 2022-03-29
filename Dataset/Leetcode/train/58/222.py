 class Solution:
    def XXX(self, s: str) -> int:
        length=len(s)
        count=0
        i=0
        while length-i-1>=0 and s[length-i-1] ==' ':
            i+=1
        while length-i-1>=0 and s[length-i-1]!=' ':
            count+=1
            i+=1
        return count


