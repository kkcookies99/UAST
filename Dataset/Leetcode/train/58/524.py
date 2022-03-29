class Solution:
    def XXX(self, s: str) -> int:
        i = 0
        length = (len(s))
        length_array = []
        tmp = ""
        for i in range(length):
            if s[i] == " ":
                if tmp:
                    length_array.append(len(tmp))
                    tmp = ''
                    continue
            else:
                tmp += s[i]
        if tmp:
            length_array.append(len(tmp))
        return length_array[-1]

