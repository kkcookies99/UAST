 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = []
        i, j = 0, 0
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                nums.append(nums1[i])
                i += 1
            else:
                nums.append(nums2[j])
                j += 1
        nums += nums2[j:]
        nums += nums1[i:]
        lens = len(nums)
        if lens % 2 == 0:
            return (nums[lens // 2 - 1] + nums[lens // 2]) / 2
        else:
            return float(nums[lens // 2])

