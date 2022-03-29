 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums,has =sorted(nums), set()
        from itertools import combinations
        for i in combinations(nums,3):
            if not sum(i):
                has.add(i)
        return list(map(list, has))

