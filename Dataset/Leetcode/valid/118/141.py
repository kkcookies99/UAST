 class Solution:
    def XXX(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        results = [[1]]
        for i in range(2, numRows+1):
            temp = []
            for j in range(i):
                if j == 0 or j == i-1:
                    temp.append(1)
                else:
                    temp.append(results[i-2][j-1] + results[i-2][j])
            results.append(temp)
        return results

