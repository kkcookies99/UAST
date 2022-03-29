 class Solution:
    def XXX(self, n: int) -> List[str]:
        parent_map = {0: "(", 1: ")"}
        res = []
        def num2parent(num):
            tmp = ""
            for i in num:
                tmp += parent_map[i]
            return tmp

        def br(choose):
            if len(choose)>2*(n):
                return
            elif sum(choose)==n:
                res.append(num2parent(choose))
                return
            for c in (0, 1):
                tmp=choose+[c]
                if tmp.count(0)>=tmp.count(1):
                    br(tmp) 
        br([])

        return res

