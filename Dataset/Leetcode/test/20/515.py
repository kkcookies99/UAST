 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        right2left,right_parn = {")":"(","}":"{","]":"["}, [")","}","]"]
        ans = True
        for i in s:
            if i in right_parn:
                if not stack or stack[-1] != right2left[i]:
                   return False
                else:
                    stack.pop()
            else:
                stack.append(i)
        return ans if stack == [] else False

