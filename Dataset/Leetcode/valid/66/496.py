class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        ans = ""
        res = []
        for i in digits:
            ans += str(i)
        ans = int(ans) + 1

        for i in str(ans):
            res.append(int(i))
        return res

