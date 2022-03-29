 class Solution:
    def XXX(self, l: List[int]) -> List[List[int]]:
        def XXX(l, target):
            d = {}
            a = []
            for n in l:
                if n in d and [n, target - n] not in a:
                    a.append([n, target - n])
                else:
                    d[target - n] = n
            return a
        
        # print(XXX([1,2,3],3))
        
        l = sorted(l)
        ans = []
        for i in range(len(l)):
            if i>=1 and l[i] == l[i-1]:
                pass
            else:
                r = XXX(l[i+1::], -l[i])
                if r:
                    for _r in r:
                        ans.append( [l[i]] + _r )
            
        return ans

