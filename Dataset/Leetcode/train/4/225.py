 class Solution(object):
    def XXX(self, nums1, nums2):
        num=nums1+nums2
        num.sort()
        length=len(num)
        if length%2==0:
            return (num[(length//2)]+num[(length//2)-1])/2
        else:
            return num[(length-1)//2]

