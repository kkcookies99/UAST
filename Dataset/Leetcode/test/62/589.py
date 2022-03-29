class Solution:
    def XXX(self, m: int, n: int) -> int:
        res = [[1]*m for _ in range(n)]
        for i in range(1,n):
            for j in range(1,m):
                res[i][j] = res[i-1][j] + res[i][j-1]
        return res[-1][-1]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


