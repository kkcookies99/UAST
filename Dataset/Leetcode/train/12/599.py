 class Solution:
    def XXX(self, num: int) -> str:
        ans = ""
        M = num // 1000
        D = num % 1000 // 500
        C = num % 500 // 100
        L = num % 100 // 50
        X = num % 50 // 10
        V = num % 10 // 5
        I = num % 5 
        if I == 4 and V == 0:
            ans = "IV"
        elif I == 4 and V == 1:
            ans = "IX"
        else:
            ans = "I" * I 
            ans = "V" * V + ans
        
        if X == 4 and L == 0:
            ans = "XL" + ans
        elif X == 4 and L ==1:
            ans = "XC" + ans
        else:
            ans = "X" * X + ans
            ans = "L" * L + ans
        
        if C == 4 and D == 0:
            ans = "CD" + ans
        elif C == 4 and D == 1:
            ans = "CM" + ans 
        else:
            ans = "C" * C + ans
            ans = "D" * D + ans
        
        ans = "M" * M + ans
        return  ans

