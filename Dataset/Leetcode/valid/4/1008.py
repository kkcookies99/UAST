 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        # 递归
        if len(nums1) == 0 and len(nums2) != 0:
            # 返回nums2的中位数
            if (len(nums2) + 1)%2 == 0:
                return nums2[(len(nums2)+1)//2-1]
            else:
                return (nums2[len(nums2)//2] + nums2[len(nums2)//2-1]) / 2
        if len(nums1) != 0 and len(nums2) == 0:
            if (len(nums1) + 1)%2 == 0:
                return nums1[(len(nums1)+1)//2-1]
            else:
                return (nums1[len(nums1)//2] + nums1[len(nums1)//2-1]) / 2
        if len(nums1) == 1 and len(nums2) == 1:
            return (nums1[0] + nums2[0])/2
        # 递归出口
        a1, b1, a2, b2 = 0, len(nums1)-1, 0, len(nums2)-1
        if nums1[a1] <= nums2[a2]:
            if nums1[b1] <= nums2[b2]:
                return self.XXX(nums1[a1+1:], nums2[a2:b2])
            else:
                return self.XXX(nums1[a1+1:b1], nums2)
        if nums1[a1] > nums2[a2]:
            if nums1[b1] <= nums2[b2]:
                return self.XXX(nums1, nums2[a2+1:b2])
            else:
                return self.XXX(nums1[a1:b1], nums2[a2+1:])

