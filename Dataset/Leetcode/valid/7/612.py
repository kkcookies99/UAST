 class Solution:
    def XXX(self, x: int) -> int:
        n1 = str(x)
        n2 = ''
        n3 = ''
        lis1 = []
        print(type(n1))
        for i in n1 :
            if i == '-' or i == '+':
                n3 = i
                continue
            else:
                lis1.append(i)
        for k in XXXd(lis1):
            n2 = n2 + k
        number = n3 + n2
        if -2**31< int(number) <2**31-1:
            return(int(number))
        else:
            return 0     

