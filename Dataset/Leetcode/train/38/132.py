class Solution:
    def XXX(self, n: int) -> str:
        from collections import deque
        init = "1"
        for _ in range(n - 1):
            ans = ""
            j = 0
            while j < len(init):
                tmp = deque()
                tmp.append(init[j])
                j += 1
                while j < len(init) and init[j] in tmp:
                    tmp.append(init[j])
                    j += 1
                ans += str(len(tmp)) + str(init[j - 1])
            init = ans
        return init

