 class Solution:
    def XXX(self, s: str) -> bool:
        temp = []
        for char in s:
            if char.isalpha() or char.isdigit():
                temp.append(char.lower())
        if str(temp) == str(temp[::-1]):
            return True
        else:
            return False

