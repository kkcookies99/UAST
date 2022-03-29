 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        n = [1,4, 5,9,10,40,50,90,100,400,500,900,1000,4000]
        c = ['I','IV','V','IX','X','XL','L', 'XC', 'C', 'CD',  'D',  'CM', 'M']
        s = str(num)
        res = ''
        index = len(c)
        while index>-1:
            while n[index]<=num<n[index+1]:
                #ss = int(str(num)[0])-n[index]
                res = res + c[index]
                num = num - n[index]
            index -= 1
        return res

