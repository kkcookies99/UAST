 class Solution:

    def recursive(self, ln, rn, res, prefix):

        if ln == 0 and rn == 1:
            res.append(prefix+')')
            return

        if ln:
            self.recursive(ln-1, rn, res, prefix+'(')

        if prefix[-1] == '(':
            self.recursive(ln, rn-1, res, prefix+')')
        elif rn > ln:
            self.recursive(ln, rn-1, res, prefix+')')

    def XXX(self, n):

        res = []
        self.recursive(n-1, n, res, '(')
        return res

