 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        res = dict()
        res[0] = [1]
        length = [1] * len(s)
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                length[i] = length[i - 1] + 1
            res[i] = []
            res[i].append(length[i])
            for item in res[i - 1]:
                if i - 1 - item >= 0 and s[i] == s[i - 1 - item]:
                    res[i].append(item + 2)
        strlen = 0
        string = ""
        for i in range(len(length)):
            if length[i] > strlen:
                strlen = length[i]
                string = s[i + 1 - strlen: i + 1]
        for i, lst in res.items():
            for x in lst:
                if x > strlen:
                    strlen = x
                    string = s[i + 1 - strlen: i + 1]
        return string

