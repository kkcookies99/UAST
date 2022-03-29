class Solution:
    def XXX(self, n: int) -> int:
        num = 0
        fibo = [1,1,1]
        for i in range(n):
            if i > 2:
                fibo.append(fibo[i-1]+fibo[i-2])
            num = num + fibo[i]
        return num

