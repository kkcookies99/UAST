 class Solution:
    def XXX(self, digits: list[int]) -> list[int]:
        digits=digits[-1::-1]
        c=0
        digits[0]=digits[0]+1
        if digits[0]>=10:
            c=1
            digits[0]=digits[0]-10
        else:
            c=0
        for i in range(1,len(digits)):
            digits[i]=digits[i]+c
            if digits[i]>=10:
                c=1
                digits[i]=digits[i]-10
            else:
                c=0
        if c==1:
            digits.append(1)
        return digits[-1::-1]

