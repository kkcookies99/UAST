 class Solution:
    def XXX(self, s: str) -> bool:
        hashmap = {"(":")", "[":"]", "{":"}"}
        stack = []
        for brace in s:
            if brace in hashmap.keys(): stack.append(brace)
            if brace in hashmap.values():
                if not stack or brace != hashmap[stack[-1]]: return False
                else: stack.pop(-1)
        if not stack: return True
        return False

