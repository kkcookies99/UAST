 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        tList = nums1 + nums2
        tList.sort()
        idx = len(tList)
        if idx % 2 == 0:
            idx = idx // 2
            ans = (tList[idx] + tList[idx-1]) / 2
        else:
            ans = tList[idx//2]
        return round(float(ans), 1)

