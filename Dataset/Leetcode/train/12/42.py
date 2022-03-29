 class Solution:
    def XXX(self, num: int) -> str:
        num_str = ''
        while num > 0:
            if num >=1000:
                n = int(num/1000)
                num%=1000
                for i in range(n):
                    num_str +="M"
            elif num >=500:
                if int(num/900) == 1:
                    num%=900
                    num_str +="CM"
                else:
                    n = int(num/500)
                    num%=500
                    for i in range(n):
                        num_str +="D"
            elif num >=100:
                if int(num/400) == 1:
                    num%=400
                    num_str +="CD"
                else:
                    n = int(num/100)
                    num%=100
                    for i in range(n):
                        num_str +="C"
            elif num >=50:
                if int(num/90) == 1:
                    num%=90
                    num_str +="XC"
                else:
                    n = int(num/50)
                    num%=50
                    for i in range(n):
                        num_str +="L"
            elif num >=10:
                if int(num/40) == 1:
                    num%=40
                    num_str +="XL"
                else:
                    n = int(num/10)
                    num%=10
                    for i in range(n):
                        num_str +="X"
            elif num >=5:
                if int(num/9) == 1:
                    num%=9
                    num_str +="IX"
                else:
                    n = int(num/5)
                    num%=5
                    for i in range(n):
                        num_str +="V"
            else:
                if int(num/4) == 1:
                    num%=4
                    num_str +="IV"
                n = int(num/1)
                num%=1
                for i in range(n):
                    num_str +="I"
        return num_str

