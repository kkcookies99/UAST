class Solution:
    def XXX(self, m: int, n: int) -> int:
        ans = [[1 for _ in range(m)] for _ in range(n)]
        for i in range(1,m):
            for j in range(1,n):
                ans[j][i] = ans[j][i-1] + ans[j-1][i]
        return ans[-1][-1]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


