 class Solution:
    def XXX(self, n: int) -> str:
        prev = curr = "1"
        for i in range(2, n+1):
            curr = ""
            start_consecutive = 0
            for j in range(1, len(prev)):
                if prev[j] != prev[j-1]:
                    curr += str(j - start_consecutive)
                    curr += str(prev[j-1])
                    start_consecutive = j
            curr += str(len(prev) - start_consecutive)
            curr += prev[-1]
            prev = curr
        return curr

