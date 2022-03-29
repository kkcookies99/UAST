 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        d = dict()
        for j in range(len(nums)):
            if nums[j] not in d.keys():
                d[nums[j]] = 1
            else:
                d[nums[j]] += 1
        a = list(d.values())
        b = list(d.keys())
        return b[a.index(1)]

