 class Solution:
    def XXX(self, strs: List[str]) -> str:
        return ''.join(map(lambda p: p.pop(), itertools.takewhile(lambda p: len(p) == 1, map(set, zip(*strs)))))

