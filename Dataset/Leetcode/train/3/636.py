 class Solution:
    def XXX(self, s: str) -> int:
        max_len = 0
        curr_str = ""
        for char_ in s:
            if char_ not in curr_str:
                curr_str += char_
                max_len = max(max_len, len(curr_str))
            else:
                curr_str = curr_str[curr_str.index(char_)+1:] + char_
        return max_len

