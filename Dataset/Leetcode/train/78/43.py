class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        return reduce(lambda x, y: x + [i + [y] for i in x], nums, [[]])

