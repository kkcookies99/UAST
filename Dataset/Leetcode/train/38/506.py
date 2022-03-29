 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return "1"
        else:
            s_n = self.XXX(n - 1)
            char_sets = [s_n[0]]
            for i in range(1,len(s_n)):
                if s_n[i-1] != s_n[i]:
                    char_sets.append(s_n[i])
            strs = ''
            for s in char_sets:
                i = 0
                temp =''
                while i<len(s_n):
                    if s == s_n[i]:
                        temp += s
                    else:
                        s_n = s_n[i:]
                        break
                    i += 1
                strs += str(len(temp)) + s
        return strs

