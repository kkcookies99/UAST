class Solution:
    def XXX(self, a: str, b: str) -> str:
        
        m = len(a) - 1
        n = len(b) - 1
        carry = 0 
        res=""

        while m >= 0 or n >=0:
            t1 = a[m] if m >= 0 else '0'
            t2 = b[n] if n >= 0 else '0'
            tmp =  ord(t1) + ord (t2) +carry - 2* ord('0')
            cur = tmp%2
            carry = tmp //2
            res= chr(cur + 48) + res
            m-=1
            n-=1
        return res if carry == 0 else '1' + res
        

