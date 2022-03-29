class Solution:
    def XXX(self, n: int) -> int:
        if n <=2 :
            return n
            
        cnt1 = 1
        cnt2 = 2
        cnt3 = 0
        for step in range(3, n+1):
            cnt3 = cnt1 + cnt2
            cnt2, cnt1 = cnt3, cnt2
        return cnt3

