 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        list = []
        s = s.lower()
        for i in s:
            if 'a'<= i <= 'z' or '0'<= i <= '9':
                list.append(i)
        return list == list[::-1]

