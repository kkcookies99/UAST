 class Solution:
    def XXX(self, s: str) -> int:
        maxlen, sub_str = 0, ''
        for ss in s:
            sub_str = sub_str[sub_str.find(ss)+1:] + ss
            maxlen = max(maxlen, len(sub_str))
        return maxlen

