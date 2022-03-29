 class Solution:
    def XXX(self, s):
        s_stack = ['#']
        s_dict = {')':'(', ']':'[', '}': '{'}
        for each in s:
            if each == '(' or each == '[' or each == '{':
                s_stack.append(each)
            else:
                if s_stack[len(s_stack) - 1] == s_dict[each]:
                    s_stack.pop()
                else:
                    return False
        if len(s_stack) == 1:
            return True
        return False

