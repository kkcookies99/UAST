 class Solution:
    def XXX(self, n: int) -> str:
        before = 1
        for _ in range(n - 1):
            num, j, num_res, pre = 0, 0, [], 0
            while before > 0:
                num = before % 10
                before //= 10
                if num != pre:
                    if pre > 0:
                        num_res.append(str(j) + str(pre))
                    j = 1
                    pre = num
                else:
                    j += 1
            num_res.append(str(j) + str(num))
            before = int(''.join(reversed(num_res)))
        return str(before)


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


