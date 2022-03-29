 class Solution:
    def XXX(self, s: str) -> int:
        dignal = ""
        signal = 0
        import re
        if not re.findall(r"^[\+\-]?\d+",s.strip()):
            return 0
        for i in re.findall(r"^[\+\-]?\d+",s.strip())[0]:
            if i == "-" or i == "+" or ord('0') <= ord(i) <= ord("9"):
                if i == "-":
                    signal += 1
                elif i == "+":
                    continue
                elif i.isdigit():
                    dignal += i
            else:
                break
        sign = 1 if signal % 2 == 0 else -1
        if not dignal:
            return 0
        tmp = dignal
        ans = 0
        for index, i in enumerate(tmp[::-1]):
            ans += (ord(i) - ord('0')) * 10 ** index
        result = int(sign * ans)
        if -2 ** 31 <= result <= 2 ** 31 - 1:
            return result
        elif result < -2 ** 31:
            return -2 ** 31
        else:
            return 2 ** 31 - 1

