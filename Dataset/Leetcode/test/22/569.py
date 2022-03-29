 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        strStack = [["", 0, 0]]
        rs =[]
        while(1):
            lenght = len(strStack)
            nextStack = []
            for tempStr, left, right in strStack:
                if left < n:
                    newKey = "".join((tempStr, "("))
                    nextStack.append([newKey, left + 1, right])
                if right < n and left > right:
                    newKey = "".join((tempStr, ")"))
                    if len(newKey) == n * 2:
                        rs.append(newKey)
                    else:
                        nextStack.append([newKey, left, right + 1])
            strStack = nextStack
            if not nextStack:
                break
        return rs

