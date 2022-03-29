 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        dic = {key: value for key, value in [('{', '}'), ('[', ']'), ('(', ')')]}
        for each in s:
            if each in '({[':
                stack.append(each)
            else:
                if not stack or each != dic[stack.pop()]:
                    return False
        return not stack

