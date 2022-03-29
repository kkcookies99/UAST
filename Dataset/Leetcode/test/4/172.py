 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        num = nums1 + nums2

        for i in range(len(num)-1):
            for j in range(i,len(num)):
                if num[i]>num[j]:
                    tmp = num[i]
                    num[i] = num[j]
                    num[j] = tmp
        
        if len(num)%2 == 0:
            return (num[len(num)//2] + num[len(num)//2-1]) / 2
        else:
            return num[len(num)//2]

