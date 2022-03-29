 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        for c in s:
            if c == '(': stack.append(')')
            elif c == '[': stack.append(']')
            elif c == '{': stack.append('}')
            elif not stack or c != stack.pop(): return False
        if not stack: return True
        else: return False

