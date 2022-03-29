 class Solution:
    def singleNumber(self, nums):
        doubled = list(set(nums)) * 2
        for n in nums:
            if n in doubled:
                doubled.remove(n)
        return doubled[0]

