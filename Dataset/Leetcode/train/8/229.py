class Solution(object):
    INT_MIN = -2**31
    INT_MAX = 2**31-1
    def skipSpace(self, i, s, slen):
        while i < slen:
            if s[i] != ' ':
                return True, i
            i += 1
        return False, 0
        
    def XXX(self, s):
        """
        :type str: str
        :rtype: int
        """
        slen = len(s)
        i = 0
        num = []
        flag, i = self.skipSpace(i, s, slen)
        
        if not flag: return 0
        positive = 1
        if s[i] == '+':
            positive = 1
            i += 1
        elif s[i] == '-':
            positive = -1
            i += 1
        if i >= slen:
            return 0
        if not s[i].isdigit():
            return 0
        else:
            while i < slen and s[i].isdigit():
                num.append(s[i])
                i += 1
        ret = int(''.join(num))*positive
        if ret < self.INT_MIN:
            return self.INT_MIN
        elif ret > self.INT_MAX:
            return self.INT_MAX
        else:
            return ret

