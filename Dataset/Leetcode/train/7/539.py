 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x > 0:
            res =  str(x)
            des = ''
            for i in range(len(res)):
                des += res[-i - 1]
            des = int(des)
            if des > (2**32 - 1):
                return 0
            else:           
                return des
        elif x == 0:
            return 0
        else:
            res =  -x
            res = str(res)
            des = ''
            for i in range(len(res)):
                des += res[-i - 1]
            des = - int(des)
            if des < - 2**32:
                return 0
            else:
                return des

