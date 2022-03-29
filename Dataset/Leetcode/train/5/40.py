 class Solution:
    def XXX(self,s):
        str_length = len(s)
        max_length = 0
        start = 0
        for i in range(str_length):
            if i - max_length >= 1 and s[i - max_length - 1:i + 2] == s[i - max_length - 1:i + 2][::-1]:
                start = i - max_length - 1
                max_length += 2
                continue
            if i - max_length >= 0 and s[i - max_length:i + 2] == s[i - max_length:i + 2][::-1]:
                start = i - max_length
                max_length += 1
        return s[start:start + max_length+1]


