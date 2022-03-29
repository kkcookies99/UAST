class Solution:
    def XXX(self, n: int) -> int:
        stepn_ = 1
        stepn = 2
        if n == 1:
            return 1;
        elif n == 2:
            return 2;
        for i in range(3,n+1):
            temp = stepn_
            stepn_ = stepn
            stepn = stepn_ + temp
        return stepn

