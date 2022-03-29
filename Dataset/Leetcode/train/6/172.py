 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if not s:
            return ""
        if numRows == 1:return s
        s_Rows = [""] * numRows
        i  = 0
        n = len(s)
        while i < n:
            for j in range(numRows):
                if i < n:
                    s_Rows[j] += s[i]
                    i += 1
            for j in range(numRows-2,0,-1):
                if i < n:
                    s_Rows[j] += s[i]
                    i += 1
        return "".join(s_Rows)

