 class Solution:

    def XXX(self, x: int) -> bool:
        m = [i for i in str(x)]
        mb = [i for i in str(x)]

        m.reverse()

        if ''.join(m)==''.join(mb):
            return True
        else:
            return False

