 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        d = []
        d.append([])
        for x in nums:
            le = len(d)
            for i in range(le):
                t = [x]
                d.append(t+d[i])
        return d

