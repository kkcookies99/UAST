 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(1, numRows):
            result.append([1])
            for j in range(0, len(result[i-1])-1):
                result[i].append(result[i-1][j]+result[i-1][j+1])
            result[i].append(1)
        return result

