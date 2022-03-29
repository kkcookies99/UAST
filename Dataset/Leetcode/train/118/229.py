 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        answer = []
        for i in range(numRows):
            answer.append([1] * (i + 1))
            for j in range(1, i // 2 + 1):
                answer[i][j] = answer[i][-j-1] = answer[i-1][j-1] + answer[i-1][j]
        return answer

