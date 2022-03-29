 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        lib = {')':'(', '}':'{',']':'['}
        for i in s:
            stack.append(i)
            if i in lib:
                if lib[i] in stack:
                    stack.pop()
                    stack.pop()
                else:
                    return False
        if stack:
            return False
        return True
            

