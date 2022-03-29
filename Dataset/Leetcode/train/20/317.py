 class Solution:
    def XXX(self, s: str) -> bool:
        result = []
        dic = {
            '}': '{',
            ']': '[',
            ')': '('
        }
        for c in s:
            if c == '}' or c == ']' or c == ')':
                if not result or result[-1] != dic[c]:
                    return False
                result.pop()
            else:
                result.append(c)

        return not result

