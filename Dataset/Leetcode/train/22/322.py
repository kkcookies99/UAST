 class Solution:
    def XXX(self, n: int) -> list:
        res = []
        self.generate(n, n, "", res)
        return res

    def generate(self, m, n, s, res):
        if n == 0:
            s = s + ")" * (2 * m - len(s))
            res.append(s)
            return
        if len(s) == 2 * (m - n):
            self.generate(m, n - 1, s + "(", res)
            return
        self.generate(m, n - 1, s + "(", res)
        self.generate(m, n, s + ")", res)



undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

