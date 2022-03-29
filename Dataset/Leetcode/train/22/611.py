 class Solution:
    def XXX(self, n: int) -> List[str]:
        def bt(n, path, count):
            if len(path) == 2*n:
                if count == 0:
                    res.append(copy.deepcopy(path))
                return
                
            path += '('
            count += 1
            bt(n, path, count)
            path = path[:-1]
            count -= 1
            if count > 0:
                path += ')'
                count -= 1
                bt(n, path, count)
                path = path[:-1]
                count += 1
        res = []
        bt(n, '', 0)
        return res

