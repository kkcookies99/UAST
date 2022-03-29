class Solution:
    def XXX(self, x: int) -> int:
        dx=["1","2","3","4","5","6","7","8","9"]
        if str(x)[0] in dx:
            x=str(x)[::-1]
            x=int(x)
            if x >= (-2 ** 31) and x <= (2 ** 31 - 1):
                return x
            else:
                return 0
        elif str(x)[0] is "-":
            x=str(x)[1:]
            x="-"+x[::-1]
            x=int(x)
            if x>=(-2**31) and x<=(2**31-1):
                return x
            else :
                return 0
        elif str(x)[0] is "+":
            x=str(x)[1:]
            x="+"+x[::-1]
            x=int(x)
            if x >= (-2 ** 31) and x <= (2 ** 31 - 1):
                return x
            else:
                return 0
        else :
            return 0

