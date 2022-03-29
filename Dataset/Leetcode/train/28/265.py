 class Solution(object):
    def getNext(self, needle):
        nextL = [-1] #nextL[x]表示前x个字符的前缀集和后缀集交集的最大长度
        j = -1
        i = 0
        nlen = len(needle)
        while i < nlen:
            #needle中前j个字符和[i-j, i)这部分字符匹配
            if j == -1 or needle[i] == needle[j]:
                i += 1
                j += 1
                nextL.append(j)
            else:
                j = nextL[j] #前j个字符已经是match的
        return nextL
    
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        #KMP
        nextL = self.getNext(needle)
        i = 0
        j = 0
        while i < len(haystack) and j < len(needle):
            if j == -1 or haystack[i] == needle[j]:
                i += 1
                j += 1
            else:
                j = nextL[j]
        if j == len(needle):
            return i - j
        return -1

