 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:        
        
        def findMid(num):
            if len(num) % 2 == 0:
                return (num[int(len(num)/2)] + num[int((len(num)-2)/2)]) / 2
            else :
                return num[int((len(num)-1)/2)] * 2 / 2 
        
        num = sorted(nums1 + nums2)
        return findMid(num)

