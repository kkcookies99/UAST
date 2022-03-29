 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(needle) == 0:
            return 0
        def get_nextArr(substring):
            pLen = len(substring)
            next = [0]*pLen
            next[0] = -1
            k = -1
            j = 0
            while j < pLen-1:
                if k == -1 or substring[j] == substring[k]:
                    j += 1
                    k += 1
                    next[j] = k
                else:
                    k = next[k]  # 递归调用，如果pj!=pk，则继续寻找pj=p[next[k]]?
            return next
        next = get_nextArr(needle)
        i = 0
        j = 0
        sLen = len(haystack)
        pLen = len(needle)
        while i < sLen and j < pLen:
            if j == -1 or haystack[i] == needle[j]:
                i += 1
                j += 1
            else:
                j = next[j]  # substring整体右移，string不变
        if j == pLen:
            return i-j
        else:
            return -1

