 class Solution:
    def XXX(self, n: int) -> List[str]:
        # 回溯
        # 条件 
        # 1. 到目前位置的右括号的个数不能超过左括号个数
        # 2. 左括号和右括号个数分别不能超过3

        res = []

        def backtrack(leftCount, rightCount, path):
            if leftCount == n and rightCount == n:
                res.append(path)
                return 
            
            # 选择 添加左括号还是右括号
            for i in range(2):
                if i == 0:
                    if leftCount == n:
                        continue
                    else:
                        path += "("
                        backtrack(leftCount+1, rightCount, path)
                        path = path[:-1]
                    
                else:
                    if rightCount == n or rightCount>=leftCount:
                        continue
                    else:
                        path += ")"
                        backtrack(leftCount, rightCount+1, path)
                        path = path[:-1]
            
        backtrack(0, 0, "")
        return res

