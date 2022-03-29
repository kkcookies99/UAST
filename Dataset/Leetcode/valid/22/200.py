 class Solution:
    def XXX(self, n: int) -> List[str]:
        output = []
        def backtrack(s, p, q):
            if q == n:
                output.append(s)
                return
            else:
                for i in range(1, n-p+1):
                    for j in range(1, p-q+i+1):
                        backtrack(s+i*'('+j*')', p+i, q+j)
        backtrack('', 0, 0)
        return output

