 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        needle = ' ' + needle 
        n, m = len(haystack), len(needle)
        nxt = [0 for _ in range(m)]
        self.getNextAdvance(needle, nxt)
        i, j = 0, 1
        while (i < n) and (j < m):
            if (j == 0) or (haystack[i] == needle[j]):
                i += 1
                j += 1
            else:
                j = nxt[j]   # 回溯
            if (m-j) > (n-i):
                break
        if j >= m:
            return i-j + 1
        else:
            return -1
             
    def getNextAdvance(self, needle, nxt):
        i = 1   
        j = 0
        while(i < len(needle)-1):
            if (j == 0) or (needle[i] == needle[j]):
                j += 1
                i += 1
                if (needle[i] != needle[j]):  
               		nxt[i] = j
                else:
                    nxt[i] = nxt[j]  # 与前缀字符相同, 则往更前回溯
            else:
                j = nxt[j]

