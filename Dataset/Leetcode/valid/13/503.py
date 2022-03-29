 class Solution:
    def XXX(self, s: str) -> int:
        roman = {'I':1, 'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}

        vals = [roman[i] for i in s]

        for idx in range(1,len(vals)):
            if vals[idx] > vals[idx-1]:
                vals[idx-1] = -vals[idx-1]
        return sum(vals)

