 class Solution:
    def XXX(self, s: str) -> bool:
        stack = ''
        if s=='':
            return True
        for i in s.lower():
            if 'a'<=i<='z':
                stack+=i
            if '0'<=i<='9':
                stack+=i
        return stack==stack[::-1]

