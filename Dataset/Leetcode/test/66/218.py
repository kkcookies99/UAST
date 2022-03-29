 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        n = len(digits)
        num = 0
        for i in range(n-1,-1,-1):
            val = 1
            for j in range(n - (i + 1), 0, -1):
                val *= 10
            num += val * digits[i]
        return list(map(int,list(str(num+1))))

