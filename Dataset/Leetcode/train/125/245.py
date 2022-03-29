 class Solution:
    def XXX(self, s: str) -> bool:
        i=0
        j = len(s)-1
        #lower()把所有大写字母改成小写,其余不变
        s = s.lower()
        while i<j:
            while not(97 <= ord(s[i]) <= 122 or 48 <= ord(s[i]) <= 57):
                if i == j:
                    return True
                i += 1
            while not(97 <= ord(s[j]) <= 122 or 48 <= ord(s[j]) <= 57):
                if i == j:
                    return True
                j -= 1
            if s[i] != s[j]:
                return False
            i += 1
            j -= 1
        return True

