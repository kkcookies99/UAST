 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        stack_map = {']':'[',')':'(','}':'{'}
        for i in s:
            if i not in stack_map:
                stack.append(i)
            elif not stack or stack_map[i] != stack.pop():
                return False
        return not stack

