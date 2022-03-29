 class Solution:
    def XXX(self, s: str) -> bool:
        if s == ' ':
            return True
        s = ''.join(filter(str.isalnum, s)).upper()
        return all(x==y for x,y in zip(s, s[::-1]))```

