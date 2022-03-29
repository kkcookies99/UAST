 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ret = []
        for i in range(1, numRows + 1):
            tmp = [1 for _ in range(i)]
            for j in range(1, len(tmp) - 1):
                # 这里注意是 i - 2
                tmp[j] = ret[i - 2][j - 1] + ret[i - 2][j]
            ret.append(tmp)
        return ret

