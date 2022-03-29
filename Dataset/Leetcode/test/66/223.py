 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        ds = "".join([str(x) for x in digits])
        res = list(str(int(ds) + 1))
        return [int(x) for x in res]
