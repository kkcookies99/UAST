 class Solution:
    def XXX(self, n: int) -> str:
        a = str(11)
        if n == 1:
            return str(1)
        elif n == 2:
            return str(11)
        else:
            for i in range(n-2):
                j = 0
                num = 1
                res = ""
                while j < len(a)-1:
                    if a[j+1] == a[j]:
                        num += 1
                        j += 1
                        continue
                    res = res + str(num) + str(a[j])
                    num = 1
                    j += 1
                res = res + str(num) + str(a[j])
                a = res
            return a

