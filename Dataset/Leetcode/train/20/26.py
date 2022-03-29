 class Solution(object):
    def XXX(self, s):
        if len(s) % 2 == 1:  # 奇数长度
            return False
        
        d = {'(': ')', '{': '}', '[': ']'}
        stack = []
        for char in s:
            if char in d:  # 左括号入栈
                stack.append(char)
            else:
                if not stack or d[stack.pop()] != char:  # 没入栈就出栈 或 出栈元素不匹配当前元素
                    return False

        return True if not stack else False


