class Solution:
    def XXX(self, a: str, b: str) -> str:
        
        tmp = str(int(a) + int(b))
        tmp = list(tmp)

        n = len(tmp)
        # 每一位只会出现 0 1 2 3的情况
        # 0 1不用处理， 2 3 需要处理
        for i in range(n-1, 0, -1):
            if tmp[i] == '2':
                tmp[i] = '0'
                tmp[i-1] = str(int(tmp[i-1]) + 1)
            if tmp[i] == '3':
                tmp[i] = '1'
                tmp[i-1] = str(int(tmp[i-1]) + 1)
        
        if tmp[0] == '2':
            tmp[0] = '0'
            tmp.insert(0, '1')
        if tmp[0] == '3':
            tmp[0] = '1'
            tmp.insert(0, '1')
        
        return "".join(tmp)


