class Solution:
    def XXX(self, a: str, b: str) -> str:
        a = list(a)
        b = list(b)
        
        c = ''
        carry = 0
        
        while a and b:
            carry, n = divmod(int(a.pop()) + int(b.pop()) + carry, 2)
            c += str(n)
            
        while a:
            carry, n = divmod(int(a.pop()) + carry, 2)
            c += str(n)
        while b:
            carry, n = divmod(int(b.pop()) + carry, 2)
            c += str(n)
         
        if carry:
            c += str(carry)
        
        return c[::-1]

