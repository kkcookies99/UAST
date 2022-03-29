 class Solution:
    def XXX(self, s: str) -> bool:
        ans = ""
        for j in range(len(s)):
            if s[j].isalnum():
                ans += s[j].lower()
        return True if ans[::-1] == ans else False

