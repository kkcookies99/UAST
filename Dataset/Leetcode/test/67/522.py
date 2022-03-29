class Solution:
    def XXX(self, a: str, b: str) -> str:
        # 从后往前
        a = a[::-1]
        b = b[::-1]
        ans = ''
        forward = 0
        i=0
        N = len(a)
        M = len(b)

        # 模2为当前值，除2为向前给的值
        while i<N and i<M:
            cur = int(a[i])+int(b[i]) + forward
            ans += str(cur%2)
            forward = cur//2
            i += 1
        if i<N:
            while i<N:
                cur = int(a[i]) + forward
                ans += str(cur%2)
                forward = cur//2
                i += 1

        if i<M:
             while i<M:
                cur = int(b[i]) + forward
                ans += str(cur%2)
                forward = cur//2
                i += 1
        if forward!=0:
            ans += str(forward)
        return ans[::-1]


