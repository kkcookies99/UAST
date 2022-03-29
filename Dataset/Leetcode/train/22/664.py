 class Solution:
    def backTrack(self, cur, i, n, l_cnt, r_cnt):
        if r_cnt > l_cnt:
            return
        if l_cnt > n:
            return
        if i == n * 2:
            self.res.append(''.join(cur))
            return
        cur.append('(')
        l_cnt += 1
        self.backTrack(cur, i + 1, n, l_cnt, r_cnt)
        cur.pop()
        l_cnt -= 1

        cur.append(')')
        r_cnt += 1
        self.backTrack(cur, i + 1, n, l_cnt, r_cnt)
        cur.pop()
        r_cnt -= 1
    def XXX(self, n: int) -> List[str]:
        self.res = []
        self.backTrack([], 0, n, 0, 0)
        return self.res

