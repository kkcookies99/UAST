 class Solution:
    def XXX(self, s: str) -> bool:
        ans = []
        for char in s:
            if char.isalpha():
                ans.append(char.lower())
            if char.isdigit():
                ans.append(char)
        return ''.join(ans) == ''.join(reversed(ans))


