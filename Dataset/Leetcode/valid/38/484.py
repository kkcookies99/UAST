 class Solution:
    def XXX(self, n: int) -> str:
        if n==1:
            return '1'
        if n==2:
            return '11'

        out = ['1','1']
        count = 2

        def go(path, count):
            if count == n:
                out[-1] = path
                return
            else:
                tmp = list()
                num = 0
                for i in range(len(path)):
                    if i<len(path)-1 and path[i] != path[i+1]:
                        num += 1
                        tmp.append(str(num))
                        tmp.append(path[i])
                        num = 0
                    elif i==len(path)-1:
                        num += 1
                        tmp.append(str(num))
                        tmp.append(path[i])
                    else:
                        num += 1
                count += 1
                go(tmp, count)

        go(out, count)
        return str(''.join(out[-1]))

