 class Solution:
    def XXX(self, s: str) -> int:
        n ={"I": 1, "V": 5, "X": 10,"L": 50,"C": 100,"D": 500,"M":1000}
        j = 0
        l = list(s)
        for i in range(len(l)):
            if i == (len(l)-1):
                j = j + n[l[i]]
            elif n[l[i]] >= n[l[i+1]]:
                j = j +n[l[i]]
            else:
                j = j -n[l[i]]
        return j

