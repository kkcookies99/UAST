 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) < len(nums2):
            nums1, nums2 = nums2, nums1

        i, j = 0, 0
        l = len(nums1) + len(nums2)
        if l==0:
            return None

        while i <= int(l / 2) and j < len(nums2):
            if nums1[i] < nums2[j]:
                if i < len(nums1) - 1:
                    i = i + 1
                else:
                    nums1.append(nums2[j])
            else:
                nums1.insert(i, nums2[j])
                i += 1
                j += 1

        if l % 2:
            ans = nums1[int(l / 2)]
        else:
            ans = (nums1[int(l / 2) - 1] + nums1[int(l / 2)]) / 2

        return float(ans)

