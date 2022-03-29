 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, x in enumerate(nums):
            d[x] = d.get(x, []) + [i]
        for i, x in enumerate(nums):
            y = target - x
            if y in d:
                if y != x:
                    return [i, d[y][0]]
                elif len(d[x]) > 1:
                    return d[x][:2]

