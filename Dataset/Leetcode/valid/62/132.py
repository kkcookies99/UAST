 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        fn_1 = 1
        fmn_2 = 1
        fm_1 = 1
        for i in range(1,n):
            fn_1 *= i
        for j in range(1,m):
            fm_1 *= j
        for k in range(1, m+n-1):
            fmn_2 *= k 
        return fmn_2 / (fm_1 * fn_1)


