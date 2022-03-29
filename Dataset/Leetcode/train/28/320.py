 class Solution(object):
    def XXX(self, haystack, needle):
        if needle == '':
            return 0
        needle = ' ' + needle
        len_needle, len_haystack = len( needle), len( haystack)
        KMP_next = [ 0 for i in range( len_needle)]
        i_1, i_2 = 1, 0
        while i_1 < len_needle - 1:
            if i_2 == 0 or needle[ i_1] == needle[ i_2]:
                i_1 += 1
                i_2 += 1
                if needle[ i_1] == needle[ i_2]:
                    KMP_next[ i_1] = KMP_next[ i_2]
                else:
                    KMP_next[ i_1] = i_2
            else:
                i_2 = KMP_next[ i_2]
        i_h, i_h_r, i_n = 0, 0, 1
        while i_h < len_haystack and i_n < len_needle:
            if i_n == 0 or haystack[ i_h] == needle[ i_n]:
                i_h += 1
                i_n += 1
                if i_n == 0:
                    i_h_r += 1
                if i_n == len_needle:
                    return i_h_r
            else:
                i_h_r = i_h_r + i_n - KMP_next[ i_n]
                i_n = KMP_next[ i_n]
        return -1

