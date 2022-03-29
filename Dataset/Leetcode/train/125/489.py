 class Solution:
    def XXX(self, s: str) -> bool:
        com=""
        for i in s:
            if i.isalnum():
                com+i.lower()
        return com == com[::-1]

