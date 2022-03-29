 class Solution(object):
    def XXX(self, s):
        answer = 0
        s_end = len( s) - 1
        Cg = { 'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        for icount in range( 0, s_end):
            answer += Cg[ s[ icount]]
            if Cg[ s[ icount]] < Cg[ s[ icount + 1]]:
                answer -= 2 * Cg[ s[ icount]]
        return answer + Cg[ s[ s_end]]

