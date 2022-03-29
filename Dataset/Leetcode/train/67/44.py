 class Solution:
    def XXX(self, a: str, b: str) -> str:
        result, buffer = "", 0
        na, nb = len(a), len(b)
        if na != nb:
            a, b = "0" * max(0, nb-na) + a, "0" * max(0, na-nb) + b
        n = max(na, nb)
        for i in range(n - 1, -1, -1):
            ai, bi = a[i] == "1", b[i] == "1"
            cur_val = ai ^ bi ^ buffer 
            buffer = ai + bi + buffer > 1
            result = ("1" if cur_val else "0") + result
        if buffer:
            result = "1" + result
        return result 

