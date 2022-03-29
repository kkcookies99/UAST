class Solution:
    def XXX(self, a: str, b: str) -> str:
        step = 0
        i = len(a) - 1
        j = len(b) - 1
        k = max(i, j)
        c = ['0'] * (k + 1)
        while i >= 0 or j >= 0:
            v1 = int(a[i]) if i >= 0 else 0
            v2 = int(b[j]) if j >= 0 else 0
            tmp = v1 + v2 + step
            c[k] = str(tmp % 2)
            step = tmp // 2
            i -= 1
            j -= 1
            k -= 1
        if step:
            return '1' + ''.join(c)
        return ''.join(c)

