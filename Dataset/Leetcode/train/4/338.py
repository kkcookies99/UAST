 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        lst = nums1 + nums2
        lst.sort()
        l = len(lst)
        if l % 2 == 1 :
            num = float(lst[int(l/2)])
        elif l % 2 == 0:
            num = (lst[int(l/2)] + lst[int(l/2)-1]) / 2
        str1 = str(num) + '0000'
        from decimal import Decimal
        ans = Decimal(str1)
        return ans

