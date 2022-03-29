 class Solution:
    def XXX(self, a: str, b: str) -> str:
        a=int(a,2)
        b=int(b,2)
        num=a+b
        arry=[]
        while True:
            arry.append(str(num % 2))
            num = num // 2
            if num == 0:
                break
        return "".join(arry[::-1])

