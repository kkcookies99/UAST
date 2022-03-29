 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        s_len = len(s)
        c,k = numRows-1,(2*numRows-2)
        arr =["" for i in range(numRows)]
        for i,char in enumerate(s):
            i_0=i%k
            y = i_0 if i_0 < numRows else c - (i_0 -c)
            arr[y] += char
        return "".join(arr)

