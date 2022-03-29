 class Solution:
    def XXX(self, num: int) -> str:
        luoma_dic = {1:'I',5:'V',10:'X',50:'L',100:'C',500:'D',1000:'M'}
        luoma_str = ''
        i = 0
        while num:
            d = num%10*(10**i)

            if d in luoma_dic:
                luoma_str = luoma_dic[d] + luoma_str
            elif d:
                if d < 4*(10**i):
                    d_n = d//(10**i)
                    luoma_str = d_n*luoma_dic[10**i] + luoma_str
                elif d == 4*(10**i):
                    luoma_str = luoma_dic[10**i] + luoma_dic[5*(10**i)] + luoma_str
                elif d < 9*(10**i):
                    d = d - 5*(10**i)
                    d_n = d//(10**i)
                    luoma_str = luoma_dic[5*(10**i)] + d_n*luoma_dic[10**i] + luoma_str
                elif d == 9*(10**i):
                    luoma_str = luoma_dic[10**i] + luoma_dic[10**(i+1)] + luoma_str
            i += 1
            num = num//10

        return luoma_str        

