 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = re.sub('[^a-z0-9]', '', s.lower())        
        return s == s[::-1]

