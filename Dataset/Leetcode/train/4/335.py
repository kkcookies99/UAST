 class Solution(object):
    def XXX(self, nums1, nums2):
        fuck = nums1 + nums2
        fuck.sort()
        fucknum = len(fuck) % 2
        fucknums = int(len(fuck) / 2)
        if fucknum == 0:
            fucknum = (fuck[(fucknums-1)] + fuck[fucknums])/2
            return fucknum
        else:
            return fuck[fucknums]

nums1 = [1,2]
nums2 = [3,4]

Solution = Solution()
print(Solution.XXX(nums1,nums2))

