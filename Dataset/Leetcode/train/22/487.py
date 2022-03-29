 class Solution:
    def XXX(self, n: int) -> List[str]:
        left = 0 #左括号个数
        count = 0 # 有效的括号个数 
        self.ans = [] 
        
        def backtrack(left,count,path):
            if left > n :return 
            if count == n: 
                if left == 0:
                    self.ans.append(copy.deepcopy("".join(path)))
                return 
            
            #添加左括号 
            path.append("(")
            left += 1 
            backtrack(left,count,path)
            path.pop(-1)
            left -= 1 

            if left > 0: #没有左括号抵消，添加右括号是无效的 
                path.append(")")
                left -= 1 
                count += 1 
                backtrack(left,count,path)
                path.pop(-1)
                left += 1 
                count -= 1 
            return 
        backtrack(left,count,[])
        return self.ans 
            

