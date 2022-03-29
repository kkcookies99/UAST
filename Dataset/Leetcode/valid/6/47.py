 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        zero_mat = [[] for row in range(numRows)]
        simlation = list(range(numRows)) + list(reversed(range(numRows)))[1:-1]

        for index, val in enumerate(s):
            sim_index = simlation[index % len(simlation)]
            zero_mat[sim_index].append(val)
        
        res = ''
        for row in zero_mat:
            res += ''.join(row)
        return res

