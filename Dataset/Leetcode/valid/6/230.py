 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        else:
            cycle = 2*numRows - 2
            new_s=''
            for j,x in enumerate(s):
                if j % cycle == 0: 
                    new_s += x
            for i in range(1, numRows - 1):
                for j,x in enumerate(s):
                    if j % cycle == i or j % -cycle == -1*i: 
                        new_s += x
            for j,x in enumerate(s):
                if j % cycle == numRows - 1: 
                    new_s += x
            return new_s

