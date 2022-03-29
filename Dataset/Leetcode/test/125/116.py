 class Solution(object):
    def XXX(self, s):
        def check(c1,c2):
            if c1 == c2:
                return True
            if (ord(c1) & 0xDF) == (ord(c2) & 0xDF):
            # 转为大写
                return True
        l = 0
        r = len(s) - 1
        while l < r:
            while l < r and not (48<=ord(s[l])<=57 or 65<=ord(s[l])<=90 or 97<=ord(s[l])<=122):
                l += 1
            while l < r and not (48<=ord(s[r])<=57 or 65<=ord(s[r])<=90 or 97<=ord(s[r])<=122):
                r -= 1
            if check(s[l],s[r]):
                l += 1
                r -= 1
            else:
                return False
        return True

