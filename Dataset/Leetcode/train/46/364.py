class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        l = len(nums)
        if l <= 1:
            return [nums]
        total = 1
        for i in range(2, l + 1):
            total *= i
        res = [[] for _ in range(total)]
        div = total
        for i in range(l):
            ni = nums[i]
            for j in range(total):
                res[j].insert(j // div % (i + 1), ni)
            div = div // (i + 2)
        return res

