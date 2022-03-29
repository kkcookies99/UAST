 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        for i in s:
            stack.append (i)
            if len (stack) > 1:
                if ''.join(stack[-2:]) == '()' or ''.join(stack[-2:]) == '[]' or ''.join(stack[-2:]) == '{}':
                    stack.pop (-1)
                    stack.pop (-1)
        return len (stack) == 0

