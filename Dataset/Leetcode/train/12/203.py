 class Solution:
    def XXX(self, num: int) -> str:
        res = ""
        letterlist = ['I', 'V','X',  'L', 'C', 'D', 'M']#1,5,10,50,100,500,1000
        s = str(num)
        n = len(s)
        while n>0:
            number_ = num//10**(n-1)
            if number_<4:
                    res = res+number_*letterlist[n*2-2]
            elif  number_==4:
                    res = res+letterlist[n*2-2]+letterlist[n*2-1]
            elif number_<9:
                    res = res+letterlist[n*2-1]+(number_-5)*letterlist[n*2-2]
            else:
                    res = res+letterlist[n*2-2]+letterlist[n*2]
            n -= 1
            num -= number_*10**n
            
        return res

