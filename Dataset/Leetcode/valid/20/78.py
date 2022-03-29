 class Solution:
    def XXX(self, s: str) -> bool:
        li = []
        for i in s:
            if i == '(' or i == '[' or i == '{':
                li.append(i)
            if i == ')' or i == ']' or i == '}':
                if li == []:
                    return False
                elif abs(ord(i) - ord(li.pop(-1))) > 2:
                    return False
        return li == []

