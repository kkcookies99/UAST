 class Solution:
    def XXX(self, n: int) -> str:
        result = ["1"]
        for i in range(n - 1):
            p = 0
            cnt = 1
            tmp = []
            while p < len(result):
                if p + 1 == len(result):
                    tmp.extend([str(cnt), result[p]])
                elif result[p + 1] == result[p]:
                    cnt += 1
                elif result[p + 1] != result[p]:
                    tmp.extend([str(cnt), result[p]])
                    cnt = 1
                p += 1
            result = tmp
        return "".join(result)

