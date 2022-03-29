 class Solution:
    def XXX(self, num: int) -> str:
        out = ''
        M_num = num//1000
        num = num%1000

        out += "M"*M_num
        C_num = num//100
        if C_num > 4:
            if C_num == 9:
                out += 'CM'
            else:
                out += 'D'+'C'*(C_num-5)
        else:
            if C_num == 4:
                out += 'CD'
            else:
                out += 'C'*C_num
        num = num%100

        X_num = num//10
        if X_num>4:
            if X_num == 9:
                out += 'XC'
            else:
                out += 'L'+'X'*(X_num-5)
        else:
            if X_num == 4:
                out += 'XL'
            else:
                out += 'X'*X_num
        num = num%10

        I_num = num
        if I_num>4:
            if I_num == 9:
                out += 'IX'
            else:
                out += 'V'+'I'*(I_num-5)
        else:
            if I_num == 4:
                out += 'IV'
            else:
                out += 'I'*I_num

        return out

