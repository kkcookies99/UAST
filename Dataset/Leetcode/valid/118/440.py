 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        result = [[1]]
        for i in range(1, numRows):
            temp = []
            for j in range(i + 1):
                if i - 1 >= 0:
                    if j - 1 >= 0 and j < i:
                        temp.append(result[i - 1][j - 1] + result[i - 1][j])
                    else:
                         temp.append(1)
            result.append(temp)
        return result

