 class Solution(object):
    def XXX(self, s, numRows):
        if numRows == 1:
            return s
        step = 2*numRows - 2
        res = ''
        mod = 0
        while mod < numRows:
            for i in range(mod,len(s),step):
                if mod == 0 or mod == numRows - 1:
                    res = res + s[i]
                elif step - i%step + int(i/step)*step < len(s):
                    res = res + s[i] + s[step - i%step + int(i/step)*step ]
                elif step - i%step + int(i/step)*step >= len(s):
                    res += s[i]
            mod += 1
        return res


