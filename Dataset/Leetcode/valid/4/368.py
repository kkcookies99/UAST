 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        tt_list = sorted(nums1 + nums2)
        len_list = len(tt_list)
        if len_list%2==1:
            return tt_list[len_list//2]
        else:
            return (tt_list[len_list//2]+tt_list[len_list//2 -1])/2

