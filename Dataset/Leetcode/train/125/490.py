 class Solution:
    def XXX(self, s: str) -> bool:
        string = "".join([ch.lower() for ch in s if (ch.isdigit() or ch.isalpha())])
        return string == string[::-1]        

