 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        s = ''
        for i in digits:
            s = s + str(i)
        num = int(s) + 1
        digit = []
        for i in str(num):
            digit.append(i)
        return digit

