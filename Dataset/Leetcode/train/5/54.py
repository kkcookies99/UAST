 import numpy as np
class Solution(object):
    def XXX(self, s):
        maxLen = 0
        maxStr = ""
        s_len = len(s)
        p = np.arange(0.5, s_len, 0.5)
        for i in p:
            if i % 1 == 0.5:
                start = (int)(i - 0.5)
                end = (int)(i + 0.5)
            else:
                start = (int)(i - 1)
                end = (int)(i + 1)
            while (start >= 0 and end < s_len):
                if s[start] == s[end]:
                    if maxLen < end - start + 1:
                        maxLen = end - start + 1
                        maxStr = s[start:end+1]
                    start = start - 1
                    end = end + 1
                else:
                    break
        if maxStr == "":
            maxStr = s[0]
        return maxStr

