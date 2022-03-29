 class Solution(object):
    def XXX(self, n):
        x_bef, x_now, amo, num = '1', '', 1, 1
        for icount_1 in range( 1, n, 1):
            len_x_bef = len( x_bef)
            for icount_2 in range( 0, len_x_bef - 1, 1):
                if x_bef[ icount_2] == x_bef[ icount_2 + 1]:
                    amo += 1
                else:
                    x_now += str( amo) + str( num)
                    amo, num = 1, x_bef[ icount_2 + 1]
            x_now += str( amo) + str( num)
            x_bef, x_now = x_now, ''
            amo, num = 1, x_bef[ 0]
        return x_bef