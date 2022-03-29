 class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """

        # int(a,2) 将二进制转化为十进制
        numa = int(a,2)
        numb = int(b,2)
        res = numa + numb

        # bin函数将十进制转化为二进制
        res2 = bin(res)
        res2 = res2[2:]


        return res2

