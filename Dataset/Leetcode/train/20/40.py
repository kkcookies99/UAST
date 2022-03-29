class Solution:
    def XXX(self, s: str) -> bool:
        dic = {"(":")","{":"}","[":"]"}
        setset = {"(","{","["}
        stack = []
        for i in range(len(s)):
            if s[i] in setset:
                stack.append(s[i])
            elif not stack and s[i] not in setset:
                return False
            else:
                if stack:
                    temp = stack.pop()
                    if dic[temp] != s[i]:
                        return False
        if stack:
            return False
        return True



