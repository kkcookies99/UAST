 class Solution:
    def XXX(self, s: str) -> str:
        temp = ""
        for i in s:
            temp += "#" + i
        temp += "#"
        maxRight = 0
        pos = 0
        str_len = len(temp)
        RL = [0] * str_len
        max_len = 0
        for i in range(str_len):
            j = 2 * pos - i
            if maxRight > i:
                RL[i] = min(RL[j], maxRight - i)
            else:
                RL[i] = 1
            while i - RL[i] >= 0 and i + RL[i] < len(temp) and temp[i - RL[i]] == temp[i + RL[i]]:
                RL[i] += 1
            if i + RL[i] - 1 > maxRight:
                maxRight = i + RL[i] - 1
                pos = i
            if RL[i] > max_len:
                max_len = RL[i]
                max_index = i
        return s[
               int((max_index - max_len) / 2 + 1):
               int((max_index + max_len) / 2)
               ]
                

