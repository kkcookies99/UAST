 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        ans = 0
        res = list()
        for i in digits:
            ans = ans * 10 + i
        for i in str(ans + 1):
            res.append(int(i))
        return res

