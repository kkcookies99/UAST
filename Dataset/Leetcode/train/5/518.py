 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        index = len(s)/2
        left = index
        right = index + 0.5
        max_str = ''
        while 1:
            if left * 2 < len(max_str):
                break
            s1 = self.getCurPalin(s, left)
            s2 = self.getCurPalin(s, right)
            max_str = max((len(s1),s1),(len(s2),s2),(len(max_str),max_str))[1]
            left -= 0.5
            right += 0.5
        return max_str
    def getCurPalin(self,s, index):
        cur = index%1
        left = int(index - cur)
        right = int(index + cur)
        length = len(s)
        while 1:
            if left >= 0 and right < length:
                if s[left] == s[right]:
                    left -= 1
                    right += 1
                else:
                    break
            else:
                break
        if left >= right -1:
            return s[left:left+1]
        return s[left+1: right]

