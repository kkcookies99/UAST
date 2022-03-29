 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = [[1] * l for l in range(1, numRows + 1)]
        for i in range(2, numRows):
            for j in range(1, i):
                res[i][j] = res[i-1][j-1] + res[i-1][j]
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


