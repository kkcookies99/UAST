 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:return "1"
        pre = self.XXX(n-1)+"0"
        count = 1
        result = str()

        for i in range(len(pre)-1):
            if pre[i] == pre[i+1]:
                count += 1
                i += 1
                continue
            result += str(count) + pre[i]
            count = 1

        return str(result)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


