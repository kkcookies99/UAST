 class Solution:
    def XXX(self, s: str) -> bool:
        new_s = ''
        for i in s:
            temp = ord(i)
            if (48 <= temp and temp < 58) or (temp >= 97 and temp < 123):
                new_s += i
            if temp >= 65 and temp < 91:
                new_s += i.lower()
        return True if new_s == new_s[::-1] else False

