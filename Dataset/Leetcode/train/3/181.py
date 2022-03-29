 class Solution:
    def XXX(self, s: str) -> int:
        s_len = len(s)
        if s_len < 2:
            return s_len
        max_len = 1
        lower_index = 0
        upper_index = 1
        sub_len = 1
        while upper_index < s_len:
            temp = s[lower_index:upper_index]
            same_index = temp.find(s[upper_index])
            if same_index != -1:
                sub_len = upper_index - lower_index
                if sub_len > max_len:
                    max_len = sub_len
                lower_index = lower_index + same_index + 1
                sub_len = upper_index - lower_index + 1
            else:
                sub_len += 1
            upper_index += 1
        return max_len if max_len > sub_len else sub_len

