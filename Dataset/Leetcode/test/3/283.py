 class Solution:
    def XXX(self, s):
        dic = {}
        left = 0
        length = 0
        for i in range(len(s)):
            if (s[i] not in dic.keys()) or (dic[s[i]] < left):
                length = max(length, i - left + 1)
            else:
                left = dic[s[i]]
            dic[s[i]] = i + 1
        return length

