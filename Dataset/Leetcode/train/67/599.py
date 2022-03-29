class Solution:
    def XXX(self, a: str, b: str) -> str:
        if not a and not b:
            return "0"

        ans = []
        bitlen = max(len(a), len(b))

        a, b = a.zfill(bitlen), b.zfill(bitlen) # 前补 0 方便计算

        carry = 0

        for i in range(bitlen-1, -1, -1): # 倒序遍历
            temp = int(a[i]) + int(b[i]) + carry # 思路和高精加法一致
            bit = temp % 2
            carry = temp // 2
            ans.append(str(bit))
        
        if carry:
            ans.append(str(carry))

        ans.reverse()

        return ''.join(ans) # 转字符串                 

