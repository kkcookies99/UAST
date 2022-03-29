class Solution:
    def XXX(self, a: str, b: str) -> str:
        s_c = str(int(a)+int(b))
        i_c = [int(i) for i in s_c]
        ans = ''
        carry = 0
        for i in range(len(i_c)-1,-1,-1):
            if carry!=0:
                m_carry = (i_c[i]+carry)//2
                i_c[i] = (i_c[i]+carry)%2
                carry = m_carry
            else:
                carry = i_c[i]//2
                i_c[i] = i_c[i]%2

        ans = ''.join(map(str,i_c))
        return '1'+ans if carry else ans

