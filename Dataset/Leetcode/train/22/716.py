 class Solution:
    def XXX(self, n: int) -> List[str]:
        tmp = ["()"]
        for j in range(n - 1):
            cur = set()
            for i in range(len(tmp)):
                for x in range(len(tmp[i]) + 1):
                    cur.add(tmp[i][:x] + "()" + tmp[i][x:])
            tmp = list(cur)
        return tmp

