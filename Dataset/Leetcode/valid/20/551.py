 class Solution:
    def XXX(self, s: str) -> bool:
        maps = {")": "(", "]": '[', "}": "{"}
        stack = []
        for c in s:
            if c not in maps:
                stack.append(c)
            else:
                if not stack: return False
                if stack[-1] == maps[c]:
                    stack.pop(-1)
                else:
                    return False
        return len(stack) == 0

