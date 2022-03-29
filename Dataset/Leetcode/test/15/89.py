 class Solution:
    def XXX(self,nums):
        ts, bs = [i for i in set(list(itertools.combinations(nums, 3))) if sum(i) == 0], {}
        for i in ts: bs.update({frozenset(i): i}) if frozenset(i) not in list(bs.keys()) else 0         
        return list(bs.values())

