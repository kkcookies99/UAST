 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        map_array = [[0 for i in range(m)] for i in range(n)]
        for i in range(m):
            map_array[0][i] = 1
        for j in range(n):
            map_array[j][0] = 1

        for i in range(1, n):
            for j in range(1, m):
                map_array[i][j] = map_array[i][j - 1] + map_array[i - 1][j]

        return map_array[n-1][m-1]

