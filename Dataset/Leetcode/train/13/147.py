class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        h1 = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
            'a': 900,
            'b': 400,
            'c': 90,
            'd': 40,
            'e': 9,
            'f': 4
        }
        
        s = s.replace(
            'CM', 'a'
        ).replace(
            'CD', 'b'
        ).replace(
            'XC', 'c'
        ).replace(
            'XL', 'd'
        ).replace(
            'IX', 'e'
        ).replace(
            'IV', 'f'
        )
        ls = [h1[c] for c in s]
        return sum(ls)
            
        
        

