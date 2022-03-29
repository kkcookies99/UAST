 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = [i for i in s.upper() if i.isalnum()]
        for i in range(int(len(s)/2)):
            if s[i] != s[-i-1]:
                return False
        return True
            

