 class Solution:
    def XXX(self, s: str) -> int:
        num = 0
        #符号位标记，默认为正
        sign = 1
        #判断结束标志
        flag = True
        for c in s:
            #判断空格,存在结束本次循环
            if(c ==" " and flag):
                continue
            #判断正负号
            if((c =="-" or c =="+") and flag):
                    sign = int(c+'1')
                    flag = False
            elif(ord(c)>=48 and ord(c)<=57):
                    num =num*10 + int(c)
                    flag = False
            else:
                break
        if(sign*num>=2**31-1):
            return 2**31-1
        elif(sign*num<=-2**31):
            return -2**31
        return sign*num

