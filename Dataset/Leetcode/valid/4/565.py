 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        length1=len(nums1)
        length2=len(nums2)
        mid=float(length1+length2)/2
        num=sorted(nums1+nums2)
        i=int(mid)
        if mid-int(mid)!=0.0:
            result=float(num[i])
        else:
            result=float(num[i-1]+num[i])/2
        return result

