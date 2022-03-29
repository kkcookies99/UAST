 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        charStack = []
        match = {'(':')', '{':'}', '[':']'}
        
        for ch in s:
            try:
                if ch in match.keys():
                    charStack.append(ch)
                else:
                    if ch == match[charStack[-1]]:
                        charStack.pop()
                    else:
                        return False
            except:
                return False
        
        return True if len(charStack) == 0 else False

