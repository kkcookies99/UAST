 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        temp = []
        def backtrack(ln,rn):
            if not ln and not rn:
                res.append(''.join(temp))
            if ln:
                temp.append('(')
                backtrack(ln -1,rn) # 递归 左括号
                temp.pop() # 回溯
            if rn > ln: # ln小于rn时，添加")"可以构成完整括号
                temp.append(')')
                backtrack(ln,rn-1) # 递归 右括号
                temp.pop() # 回溯
        if not n:
            return res
        backtrack(n,n)
        return res

