class Solution:
    def XXX(self, n: int) -> int:
        k = sum = 0
        for i in range(n-2):
            sum += 1
            r = sum
            for j in range(n // 2):
                sum += 2
                if sum == n:
                    a=math.factorial(i+j+2)
                    b=math.factorial(i+1)*math.factorial(j+1)
                    k+=int(a/b)
                    sum = r
                    break
                elif sum > n:
                    sum = r
                    break
        if n%2==0:
            return k+2
        else:
            return k+1

