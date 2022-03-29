 class Solution:

    def getStrNsubStr(self,s,n):
        rs = []
        for i in range(len(s)):
            rs.append(s[i:i+n])
            if i+n==len(s):
                break
        return rs
    
    def strIsPalindrome2(self, s):
        l = len(s)
        if l == 0:
            return False
        elif l == 1:
            return True
        elif l == 2:
            if s[0]==s[1]:
                return True
            else:
                return False

        for i in range(int(l/2)):
            if s[i] == s[l-i-1]:
                continue
            else:
                return False
        return True

    def XXX(self, s: str) -> str:
        for i in range(len(s)):
            n = len(s)-i
            subStr = self.getStrNsubStr(s,n)
            for sStr in subStr:
                if self.strIsPalindrome2(sStr):
                    return sStr
                else:
                    continue
        return  ""



