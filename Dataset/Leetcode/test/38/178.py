class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return "1"
        cas = "1"

        for x in range(n - 1):
            print(x)
            nlist = list(cas)
            res = ""
            temp = 1
            if cas == "1":
                res = "11"
            else:
                for i in range(len(nlist) - 1):
                    if i == len(nlist) - 2 and nlist[i] != nlist[i + 1]:
                        res = res + str(temp) + nlist[i]
                        res = res + "1" + nlist[i + 1]
                        temp = 1
                    elif i == len(nlist) - 2 and nlist[i] == nlist[i + 1]:
                        res = res + str(temp + 1) + nlist[i]
                        temp = 1
                    elif nlist[i] != nlist[i + 1]:
                        res = res + str(temp) + nlist[i]
                        temp = 1
                    else:
                        temp = temp + 1
            cas = res    
        return res
