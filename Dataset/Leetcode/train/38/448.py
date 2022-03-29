 class Solution:
    def XXX(self, n: int) -> str:
        pre = "1"
        cur = ""
        while n > 1:
            cur = self.helper(pre)
            pre = cur
            n -= 1
        return pre

    def helper(self, string):
        res = ""
        tmp = 0
        for i in range(len(string)):
            if string[i] == string[tmp]:
                if i == len(string) - 1:
                    res += str(i - tmp + 1) + string[tmp]
                else:
                    continue
            else:
                res += str(i - tmp) + string[tmp]
                tmp = i
                if i == len(string) - 1:
                    res += str(1) + string[i]
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


