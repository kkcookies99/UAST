class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        a = [str(i) for i in digits]
        b = str(int(''.join(a)) + 1)
        return [int(i) for i in b]

