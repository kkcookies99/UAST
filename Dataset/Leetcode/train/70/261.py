class Solution:
    def XXX(self, n: int) -> int:
        nums = int(n/2)
        sum = 1
        if nums > 0:
            for i in range(nums):
                sum += comb(n-i, i)
        return sum

