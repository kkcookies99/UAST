 class Solution(object):
    def XXX(self, n):
        
        def poss(str, balance):
            if balance < 0: return []
            if len(str) < n*2: return poss(str+"(", balance+1) + poss(str+")", balance-1)
            return [str] * (balance == 0)

        return poss("", 0)

