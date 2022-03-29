 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
#         删除尾部多余空格
        s = s.rstrip()
    
        if not s:
            return 0
        
        for i, c in enumerate(s[::-1]):
            if c == ' ':
                return i
        return len(s)

