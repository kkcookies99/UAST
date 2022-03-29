 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        res = []
        length = len(nums1) + len(nums2)
        size = length // 2 + 1
        avg = True if length % 2 == 0 else False
        p1, p2 = 0, 0
        while p1 < len(nums1) or p2 < len(nums2):
            if p1 >= len(nums1):
                res.append(nums2[p2])
                p2 += 1
            elif p2 >= len(nums2):
                res.append(nums1[p1])
                p1 += 1
            else:
                num1, num2 = nums1[p1], nums2[p2]
                if num1 <= num2:
                    res.append(num1)
                    p1 += 1
                else:
                    res.append(num2)
                    p2 += 1
            if len(res) == size:
                break
        mid = (res[-1] + res[-2]) / 2 if avg else res[-1]
        return mid

