 class Solution(object):
    def XXX(self, nums, target):
        # """
        # :type nums: List[int]
        # :type target: int
        # :rtype: List[int]
        # """

        for i in nums:
            y = target - i
            for j in nums:
                if (j != i) & (j == y):
                    return [nums.index(i), nums.index(j)]
                if j == i:
                    if (nums.index(i) != nums.index(j)):
                        return [nums.index(i), nums.index(j)]

