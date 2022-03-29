 class Solution:
    def XXX(self, s):
        s_stack = ['#']
        s_dict = {')':'(', ']':'[', '}':'{'}

        for i in range(len(s)):
            if s[i] == '(' or s[i] == '[' or s[i] == '{':
                s_stack.append(s[i])

            else:
                if s_dict.get(s[i]) == s_stack[len(s_stack) - 1]:
                    s_stack.pop()
                else:
                    return False

        if len(s_stack) == 1:
            return True

        return False

