 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        for c in s:
            count = to_int(c)
            if len(stack) == 0 and count < 0:
                return False
            if count > 0:
                stack.append(count)
            else:
                if stack.pop() + count != 0:
                    return False
        if len(stack) == 0:
            return True
        else:
            return False


def to_int(char: str) -> int:
    if char == '(':
        return 1
    if char == ')':
        return -1
    if char == '[':
        return 2
    if char == ']':
        return -2
    if char == '{':
        return 3
    if char == '}':
        return -3

