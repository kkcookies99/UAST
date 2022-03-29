 class Solution:
    def XXX(self, num: int) -> str:
        dic = {1 : 'I', 5 : 'V', 10 : 'X', 50 :'L', 100 :'C', 500 : 'D', 1000 : 'M'}
        s = ""
        while num:
            if num % 10 == 9:
                s = s + 'IX'
                num = num - num%10
            elif num %10 == 4:
                s = s + 'IV'
                num = num - num%10
            elif num % 10 >= 5:
                s = s + dic[5] + (num % 10 -5)*dic[1]
                num = num - num%10
            elif 0<num %10 <5 : 
                s= s + dic[1]*(num%10)
                num = num - num%10

            elif num %100 == 90:
                s =  'XC' +s
                num = num - num % 100
            elif num % 100 == 40:
                s =  'XL' +s
                num = num - num % 100

            elif num % 100 >= 50:
                s = 'L' + int((num%100-50)/10) * dic[10] +s
                num = num - num % 100

            elif 0<num % 100 < 50:
                s = dic[10]*int((num%100)/10) + s
                num = num - num % 100

            elif num % 1000 == 900:
                s = 'CM' + s
                num = num  -num % 1000

            elif num % 1000 == 400:
                s = 'CD' + s 
                num = num - num % 1000

            elif num % 1000 >= 500:
                s = 'D'+'C'*int((num%1000-500)/100 )+ s 
                num = num - num % 1000
            elif 0 <num % 1000 < 500:
                s = 'C' *int((num%1000)/100) +s
                num = num - num % 1000

            elif num >=1000:
                s = int(num/1000 )*'M' + s 
                num = num -num %10000

        return s 

   


