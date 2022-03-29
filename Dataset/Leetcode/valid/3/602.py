 class Solution:
    def XXX(self, s: str) -> int:
        max_sub_s = ''
        len_sub_s = 0
        for i_s in s:
            if i_s in max_sub_s:
                max_sub_s = max_sub_s[max_sub_s.index(i_s)+1:]
            max_sub_s += i_s
            len_sub_s = max(len_sub_s, len(max_sub_s))
        return len_sub_s

