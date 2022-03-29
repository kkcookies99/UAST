 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        news = s.split(' ')
        while(news[-1] == ''):
            news = news[:-1]
            if len(news)==0:
                return 0
        return len(news[-1])

