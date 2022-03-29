 class Solution:
    def XXX(self, num: int) -> str:
        r=''
        d = {'M':1000, 'CM':900, 'D':500, 'CD':400,'C':100, 'XC':90,
         'L':50,'XL':40, 'X':10, 'IX':9,'V':5, 'IV':4, 'I':1}
        for k,v in d.items():
            if num>=v:
                n=int(num/v)
                r=r+k*n
                num=num-n*v
                if num==0: return r

