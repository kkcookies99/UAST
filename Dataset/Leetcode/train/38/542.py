 class Solution:
    def XXX(self, n: int) -> str:
        ss = ""
        if n == 1:
            return "1"
        else:
            split_index = 0
            s = self.XXX(n-1)
            ss = ''
            for i in range(len(s)):
                if i + 1 < len(s):
                    if s[i] == s[i + 1]:
                        continue
                    ss = ''.join((ss, str(i+1-split_index), s[i]))
                    split_index = i + 1
                else:
                    ss = ''.join((ss, str(i + 1 - split_index), s[i]))

            return ss

