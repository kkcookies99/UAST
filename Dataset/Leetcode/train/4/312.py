 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        l = sorted(nums1+nums2)
        v,m = divmod(len(l),2)
        if m==0:
            res = (l[v]+l[v-1])/2.0
        else:
            res = l[v]

        return res

