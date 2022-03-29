 class Solution:
    def XXX(self, s: str, numRows: int) -> str:

        if numRows==1:
            return s
        res = ["" for _ in range(numRows)]

        length = len(s)

        for i in range(length):

            t = i % (2 * numRows - 2)

            if t>=numRows:
                t = (2 * numRows - 2 - t)
            res[t]+= s[i]
        
        return "".join(res)

