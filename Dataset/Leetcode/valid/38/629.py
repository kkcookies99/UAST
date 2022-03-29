 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """

        a = '1'
        for i in range(1,n):
            a = a.replace('111', 'a')
            a = a.replace('222', 'b')
            a = a.replace('333', 'c')
            a = a.replace('11', 'd')
            a = a.replace('22', 'e')
            a = a.replace('33', 'f')
            a = a.replace('1', 'g')
            a = a.replace('2', 'h')
            a = a.replace('3', 'i')
            a = a.replace('a', '31')
            a = a.replace('b', '32')
            a = a.replace('c', '33')
            a = a.replace('d', '21')
            a = a.replace('e', '22')
            a = a.replace('f', '23')
            a = a.replace('g', '11')
            a = a.replace('h', '12')
            a = a.replace('i', '13')
        return a 


