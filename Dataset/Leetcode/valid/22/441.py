 class Solution:
    def XXX(self, n: int) -> List[str]:


        # x 为剩余的")"的数量, y 为需要递归的次数， z为当前递归可添加的")"的数量范围, 默认为2 -> (0, 1)
        def add(x: int, y: int, z=2):  
            if y == 1:  # 如果递归了n次, 返回"("和剩余的")" (共x个)
                return ["("+")"*x]
            ans = []
            for i in range(z): 
                for j in add(x-i, y-1, z+1-i):  # z+1-i 能够判断下一次递归的数量范围
                    ans.append("(" + ")"*i + j) 
            return ans


        return add(n, n)

# 将括号组合看成n个以"("开头的字符串组成的字符串
# 如"((()))" 就可以看成"(", "(" 和 "()))"
# 如"(()())" 就可以看成"(", "()" 和 "())"
# 每次递归都增加 一个 "(" 和 在一定数量范围内的 ")"

