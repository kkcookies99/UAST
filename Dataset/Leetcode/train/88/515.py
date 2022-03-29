 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        p1, p2 = 0,0
        nums3 = []
        while(True):
            if p1 == m :
                nums3 += nums2[p2 : ]
                break
            if p2 == n :
                nums3 += nums1[p1 : m]
                break
            if nums1[p1] <= nums2[p2] :
                nums3.append(nums1[p1])
                p1 += 1
            else:
                nums3.append(nums2[p2])
                p2 += 1
        return nums3

