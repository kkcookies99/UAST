 class Solution:
    def XXX(self, num: int) -> str:
        m = {
            1: 'I', 
            5: 'V', 
            10: 'X', 
            50: 'L', 
            100: 'C', 
            500: 'D', 
            1000: 'M', 
            4: 'IV', 
            9: 'IX', 
            40: 'XL', 
            90: 'XC', 
            400: 'CD', 
            900: 'CM'
        }

        if num in m:
            return m[num]

        nums = self.helper(num)

        s = ''

        for n in nums:
            if n in m:
                s += m[n]
            elif n < 5:
                s += 'I' * n
            elif n < 10:
                s += 'V' + 'I' * (n - 5)
            elif n > 1000:
                s += 'M' * (n // 1000)
            elif n > 500:
                s += 'D' + 'C' * ((n - 500) // 100)
            elif n > 100:
                s += 'C' * (n // 100)
            elif n > 50:
                s += 'L' + 'X' * ((n - 50) // 10)
            elif n > 10:
                s += 'X' * (n // 10)
        return s
        


    def helper(self, num: int) -> List[int]:
        res = [num % 10]

        num = num // 10
        while num != 0:
            res.append(num % 10)
            num = num // 10

        return [n*10**i for i, n in enumerate(res)][::-1]

