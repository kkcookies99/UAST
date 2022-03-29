 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n==1:
            return ['()']
        s = ['1'+(2*n-1-len(bin(i)[2:]))*'0'+bin(i)[2:] for i in range(1,2**(2*n-1))]
        out = []
        for c in s:
            temp = []
            bal = 0
            for i in c:
                if i=='1': 
                    bal += 1
                    temp.append('(')
                else: 
                    bal -=1
                    temp.append(')')
                if bal<0: break
            if bal==0: out.append(''.join(temp))
        return out

