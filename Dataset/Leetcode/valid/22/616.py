 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n  == 0:
            return ['']
        if n == 1:
            return ['()']
        res = []
        def DSF(left, right, k, s):
            if left < right or left>k or right>k: return
            if left == right and left==k:
                res.append(s)
            DSF(left+1, right, k, s+'(')
            DSF(left, right+1, k, s+')')
        DSF(0,0,n,'')
        return res




