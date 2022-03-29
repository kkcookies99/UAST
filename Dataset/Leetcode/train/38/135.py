class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        ch_list = list(self.XXX(n-1))
        ch, ch_count = ch_list[0], 1
        str_ans = ""
        for i in range(1, len(ch_list)):
            if ch == ch_list[i]:
                ch_count += 1
            else:
                str_ans += str(ch_count) + ch
                ch = ch_list[i]
                ch_count = 1
        str_ans += str(ch_count) + ch
        return str_ans

