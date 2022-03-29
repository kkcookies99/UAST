 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        lennum = 0
        for i in range(len(s)):
            tmplist = [s[i]]
            for j in range(i+1, len(s)):
                if s[j] not in tmplist:
                    tmplist.append(s[j])
                else:
                    break
            if len(tmplist) > lennum :
                lennum = len(tmplist)
        return lennum
                    

