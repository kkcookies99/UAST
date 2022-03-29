 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        str=s.split(" ")
        for i in str[::]:
            if i=='':
                str.remove('')
        return (len(str[-1]))

