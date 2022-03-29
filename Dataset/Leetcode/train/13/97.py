class Solution:
    def XXX(self, s: str) -> int:
        
        total = 0

        k_v = {
            'IV': 4,
            'IX': 9,
            'XL': 40,
            'XC': 90,
            'CD': 400,
            'CM': 900,
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        for x in k_v:
            total += s.count(x) * k_v.get(x)
            s = s.replace(x, '')

        return total


