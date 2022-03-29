class Solution:
    def XXX(self, x: int) -> int:
        s = str(x)
        s = "-" + s.replace("-","")[::-1] if "-" in s else s[::-1]
        return (int(s) if int(s)<2**31-1 and int(s)>-2**31 else 0)

