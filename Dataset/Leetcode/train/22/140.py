 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        
        def helper(left_p, right_p, tmp):
            if left_p == 0 and right_p == 0:
                res.append(tmp)
                return
            if left_p < 0 or right_p < 0 or left_p > right_p:
                return 
            helper(left_p-1, right_p, tmp+"(")
            helper(left_p, right_p-1, tmp+")")
        helper(n, n, "")
        return res

