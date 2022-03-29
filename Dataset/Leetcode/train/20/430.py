 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch in '([{':  # 左括号入栈
                stack.append(ch)
            elif ch in ')]}':  # 右括号弹栈
                if not stack:
                    return False
                ch2 = stack.pop()
                # 看看是否匹配 不匹配直接False
                if ch == ')' and ch2 != '(' or ch == ']' and ch2 != '[' \
                        or ch == '}' and ch2 != '{':
                    return False

        if not stack:
            return True
        return False

