 class Solution(object):
    def XXX(self, n):
        # 递归优化（16ms）
        ret_list = []
        def dfs(paths,num,lnum,rnum):
            if len(paths) == n*2: # 长度为n*2时停止迭代
                ret_list.append(paths)
                return
            if lnum < num: # 左括号数量不多于n
                dfs(paths+'(',num,lnum+1,rnum)
            if rnum < lnum: # 右括号数量不多于左括号
                dfs(paths+')',num,lnum,rnum+1)
        dfs('',n,0,0)
        return ret_list

