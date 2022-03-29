 class Solution:
    def XXX(self, s: str) -> bool:
        self.stack = []
        dic = {'(': ')', '[': ']', '{': '}'}
        for i in s:
            if i in ('(', '[', '{'):
                self.stack.append(i)
            else:
                if self.stack and i == dic[self.stack[-1]]:
                    self.stack.pop()
                else:
                    return False
        return not self.stack
                

