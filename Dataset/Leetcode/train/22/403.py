 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        def valid(arr):
            res = []
            for i in range(len(arr)):
                countL = 0
                countR = 0
                for s in arr[i]:
                    if s == '(':
                        countL += 1
                    else:
                        countR += 1
                    if countR>countL:
                        break
                if countR == countL:
                    s = ''.join(arr[i])
                    if s not in res: 
                        res.append(''.join(arr[i])) 
            return res
        def dfs(paths,num,lnum,rnum):
            if len(paths)==num*2:
                res.append(paths)
                return
            if lnum<num:
                dfs(paths+'(',num,lnum+1,rnum)
            if rnum<num:
                dfs(paths+')',num,lnum,rnum+1)
        dfs('',n,0,0)
        return valid(res)


