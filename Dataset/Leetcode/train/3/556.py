 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        pre = 0
        cur = 1
        max = len(s)
        res = []

        if max <= 1:return max

        while cur != max:
            if s[pre:cur].__contains__(s[cur]):
                res.append(cur-pre)
                pre+=1
                cur = pre + 1
            else:
                cur+=1

        if s[pre] != s[cur - 1]:
            res.append(cur - pre)
        
        res.sort()

        return res[-1]

