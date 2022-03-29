 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        def findk(s1, s2, k):
            idx1 = 0
            idx2 = 0

            while True:
                if idx1 == m:
                    return s2[idx2 + k - 1]
                if idx2 == n:
                    return s1[idx1 + k -1]
                if k == 1:
                    return min(s1[idx1], s2[idx2])

                cut = k//2
                new1 = min(idx1+cut-1, m-1)
                new2 = min(idx2+cut-1, n-1)
                if s1[new1] >= s2[new2]:
                    k -= new2 + 1 - idx2
                    idx2 = new2+1
                else:
                    k -= new1 + 1 -idx1
                    idx1 = new1 + 1

        m, n = len(nums1), len(nums2)
        total = m + n
        if total % 2 == 1:
            return findk(nums1, nums2, total // 2 + 1)
        else:
            return (findk(nums1, nums2, total // 2) + findk(nums1, nums2, total // 2 + 1))/2



