 class Solution:
    def XXX(self, s: str) -> bool:
        s = ''.join(filter(str.isalnum,s)).lower()
        length = len(s)
        i = 0
        j = length-1
        while(i < j):
            if(s[i] != s[j]):
                return False
            i = i+1
            j = j-1
        return True

