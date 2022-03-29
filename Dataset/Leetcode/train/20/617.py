 class Solution:
    def XXX(self, s: str) -> bool:
        # 将左括号存入栈中，当遇到对应右括号时，出栈
        stack = []
        for c in s:
            # 左括号
            if c in '([{':
                stack.append(c)
            # 右括号
            else:
                # 栈不为空，且栈顶元素和右括号不成对，则说明不是有效括号
                if stack and stack.pop()+c in ['()', '[]', '{}']:
                    continue
                else:
                    return False                
        return not stack

