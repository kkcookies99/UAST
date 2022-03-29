class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        digits = [str(i) for i in digits]
        s = str(int(''.join(digits))+1)
        ans = [int(i) for i in s]
        return ans

