class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        flag = 1
        ans = []
        n = len(digits)
        for i in range(n - 1,-1,-1):
            cur = digits[i] + flag
            if cur >= 10:
                cur %= 10
                flag = 1
            else:
                flag = 0
            ans.append(cur)
        if flag:
            ans.append(1)
        return ans[::-1]

