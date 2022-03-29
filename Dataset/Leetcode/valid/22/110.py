 class Solution:
    def XXX(self, n: int) -> List[str]:
        self.ans = []
        self.helper(0, 0, n, '')
        return self.ans
        
    def helper(self, left_used: int, right_used: int, n: int, result: str):
        if left_used == n and right_used == n:
            self.ans.append(result)
            return
        if left_used < n:
            self.helper(left_used + 1, right_used, n, result + '(')
        if left_used > right_used and right_used < n:
            self.helper(left_used, right_used + 1, n, result + ')')

