class Solution:
    def XXX(self, a: str, b: str) -> str:
        out = ""
        bit = 0
        if len(a) <= len(b) :
            add_short = a
            add_long = b
        else :
            add_short = b 
            add_long = a
        for i in range(len(add_long)+1):
            if i < len(add_short):
                summ = int(add_short[-(i+1)]) + int(add_long[-(i+1)]) + bit 
                if summ == 0:
                    out = "0" + out
                    bit = 0
                elif summ == 1:
                    out = "1" + out
                    bit = 0
                elif summ == 2:
                    out = "0" + out
                    bit = 1
                elif summ == 3:
                    out = "1" + out
                    bit = 1
            elif i < len(add_long):
                summ = int(add_long[-(i+1)]) + bit
                if summ == 0:
                    out = "0" + out
                    bit = 0
                elif summ == 1:
                    out = "1" + out
                    bit = 0
                elif summ == 2:
                    out = "0" + out
                    bit = 1
            elif i == len(add_long) and bit == 1:
                out = "1" + out
                bit = 0
        return out   

