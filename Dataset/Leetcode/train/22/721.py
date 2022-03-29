 class Solution:
    def XXX(self, n: int) -> List[str]:
        self.res = []
        # cur 当前序列， l 剩余左括号数量， r 剩余右括号数量， s 目标序列长度
        def dfs(cur, l, r, s):
            if len(cur) == s:
                self.res.append(cur[:])
            else:
                # 保证当前剩余右括号数量比剩余左括号多，就说明当前序列是安全的
                if l > 0 and l <= r: dfs(cur+"(", l-1, r, s)
                if r > 0 and l <= r: dfs(cur+")", l, r-1, s)
        dfs("", n, n, 2*n)
        return self.res


