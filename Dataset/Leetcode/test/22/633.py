 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(tmp, i, j):  # i控制 括号个数，j控制一个括号是否完整
            # print(tmp)
            if i == 0 and j == 0:  # 括号个数使用完，并且是完整的，就添加到结果中
                ret.append(tmp)
            elif j > n or j < 0 or i < 0:  # 超出了就直接返回了
                return
            else:
                dfs(tmp + ")", i, j-1)  # 如果是 右边，就闭合一个反括号，但是个数没有变化
                dfs(tmp + "(", i-1, j+1)  # 如果是 左边，那么继续减少个数，但是不完整个数增加
        ret = []
        tmp = dfs("(", n-1, 1)
        # print(ret)
        return ret

