 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        l1 = {'(':0,'{':1,'[':2}
        l2 = {')':0,'}':1,']':2}
        for char in s:
            if(char in l1.keys()):
                stack.append(char)
            else:
                if(stack!=[] and l1[stack[-1]] == l2[char]):
                    stack.pop()
                else:
                    return False
        if(len(stack) == 0):
            return True
        return False

