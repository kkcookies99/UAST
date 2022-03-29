 class Solution:
    def get_kth(self, nums1, nums2, k):
        # print(nums1, nums2, 'k=', k)
        m, n = len(nums1), len(nums2)
        if m == 0: return nums2[k-1]
        if n == 0: return nums1[k-1]
        if k == 1: return min(nums1[0], nums2[0])
        drop1, drop2 = min(k//2, m), min(k//2, n)   # 丢弃个数
        # print('m={},n={},k/2={},drop1={},drop2={}'.format(m,n,k//2,drop1,drop2))
        if nums1[drop1-1] <= nums2[drop2-1]:  # 丢弃nums1部分
            return self.get_kth(nums1[drop1:m], nums2, k-drop1)
        else:
            return self.get_kth(nums1, nums2[drop2:n], k-drop2)
    
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        # 整合奇偶数情况
        mid_left = self.get_kth(nums1, nums2, (m+n+1)//2)
        mid_right = self.get_kth(nums1, nums2, (m+n+2)//2)
        return (mid_left+mid_right)/2   

