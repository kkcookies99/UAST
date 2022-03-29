 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        num = nums1 + nums2
        num.sort()
        n = len(num)

        slow, fast = 0, 0
        while fast < n-1:
            fast += 1
            slow += 1
            if fast<n-1:
                fast += 1

        if n%2==0:  return (num[slow] + num[slow-1])/2
        else:  return float(num[slow])

