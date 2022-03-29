 class Solution:
    def XXX(self, s: str) -> bool:
        brackets = '([{<>}])'
        stack=[]
        for i in s:
            if len(stack)==0 or brackets.index(i)+brackets.index(stack[-1])!=7:
                stack.append(i)
                continue
            if brackets.index(i)+brackets.index(stack[-1])==7:
                stack.pop()
        if len(stack)==0:
            return True
        else:
            return False