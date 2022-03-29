 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        num = sorted(nums1 + nums2)
        if len(num) % 2 == 0:
            mind = (num[(len(num) // 2 - 1)] + num[(len(num) // 2)]) / 2
        else:
            mind = num[(len(num) // 2)]

        result = "{0:.5f}".format(mind)
        return result

