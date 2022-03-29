 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1],[1,1]]
        else:
            res = [None] * numRows
            res[0] = [1]
            res[1] = [1,1]
            for i in range(2, numRows):
                tem_lst = [None] * (i+1)
                tem_lst[0] = 1
                tem_lst[-1] = 1
                last_lst = res[i-1]
                for j in range(1,i):
                    tem_lst[j] = last_lst[j-1] + last_lst[j]
                res[i] = tem_lst
        return res


