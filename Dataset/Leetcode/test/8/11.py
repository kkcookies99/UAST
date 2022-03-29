class Solution:
    def XXX(self, s: str) -> int:
        d_str = '0'
        s_new = s.lstrip()
        sign = s_new[0] if s_new and s_new[0] in "-+" else ''
        for i, v in enumerate(s_new):
            if i == 0 and v == sign: pass
            elif v.isdigit():
                d_str += v
            else: break
        x = int(sign + d_str)
        x = [[2**31 - 1,  -2**31][x < 0], x][x.bit_length() < 32]
        return x

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

