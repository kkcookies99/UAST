class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        digitsLen =len(digits)
        s = ''
        for i in digits:
            s = s+str(i)
        s = str(int(s)+1)
        return [int(x) for x in s]

