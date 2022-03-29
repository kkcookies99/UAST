 class Solution:
    def XXX(self, s):

        d = {'}': '{', ']': '[', ')': '('}

        stk = [' ']

        for c in s:

            c2 = d.get(c, '')
            if stk[-1] == c2:
                stk.pop()
            elif c2:
                return False
            else:
                stk.append(c)

        return len(stk) == 1

