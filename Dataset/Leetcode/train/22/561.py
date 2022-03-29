 class Solution:
    def XXX(self, n: int) -> List[str]:
        s = ['']
        for i in range(n):
            l = len(s[0])
            ans = []
            for j in range(l//2+1):
                for tmp_s in s:
                    b = list(tmp_s)
                    b.insert(j,'()')
                    tmp_s = ''.join(b)
                    if tmp_s not in ans:
                        ans.append(tmp_s)
            s = ans
        return s

