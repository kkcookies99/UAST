 class Solution:
    def XXX(self, num: int) -> str:
        str_dict = {1: 'I', 4: 'IV', 5: 'V', 9: 'IX', 
                    10: 'X',40: 'XL', 50: 'L', 90: 'XC', 
                    100: 'C',400: 'CD', 500: 'D', 900: 'CM', 1000: 'M'}
        str_num = str(num)
        s = ""
        
        for i, n in enumerate(str_num):
            pow_ten = 10**(len(str_num)-1-i)
            n = int(n) * pow_ten
            if n == 0:
                continue
            if n in str_dict:
                s += str_dict[n]
            else:
                first_num = int(str(n)[0])
                if first_num > 5:
                    s += str_dict[5 * pow_ten] + (first_num-5) * str_dict[pow_ten]
                else:
                    s += str_dict[pow_ten] * first_num
                
        return s

