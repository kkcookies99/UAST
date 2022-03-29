 class Solution:
    def XXX(self, s: str) -> bool:
        if s == '':
            return True
        if len(s) < 2:
            return False
        kh = {'(': ')', '[': ']', '{': '}'}
        # 只放左括号，依次入栈，如果碰到右括号，则与栈顶的元素匹配，如果能匹配则读取下一个字符，不匹配就返回False
        stack = []
        for c in s:
            if c in kh.keys():
                stack.append(c)
            else:
                if stack == [] or c != kh[stack[-1]]:
                    return False
                stack.pop()
        return True if stack == [] else False

