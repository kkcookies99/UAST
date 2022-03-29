 class Solution:
    def XXX(self, s: str) -> bool:
        left = ['(', '[', '{']
        right = [')', ']', '}']
        mapping = dict(zip(left, right))
        stack = []
        for i in s:
            if len(stack) == 0 or i in left:   # 栈为空或字符为左括号则进栈
                stack.append(i)
            elif (stack[-1] in left) and (mapping[stack[-1]] == i): # 若栈中最后一个字符为左括号并且i为与之对应的右括号
                stack.pop()      # 将栈中上面的元素出栈
            else:
                return False
        if len(stack) == 0:     # 若遍历结束后栈为空说明全部匹配成功
            return True
        else:
            return False        # 否则有未匹配的括号，返回False

