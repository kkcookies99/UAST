 class Solution(object):
    def XXX(self, n):
        if n == 1:
            return ["()"]
        res = ["()"]
        for i in range(2,n+1):
            tmp = []
            for r in res:
                for loc in range(len(r)):
                    n_r = r[:loc] + "()" + r[loc:]
                    if n_r not in tmp:
                        tmp.append(n_r)
            res = tmp
        return res



undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


