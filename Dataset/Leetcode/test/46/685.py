 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def fac(n):
            if n <= 1:
                return 1
            return math.factorial(n)
        lenNum = len(nums)
        length = fac(lenNum)
        res = []
        for i in range(length):
            li = []
            left = nums.copy()
            l = 0
            le = lenNum
            while l < lenNum:
                idx = i // fac(lenNum - l - 1) % le
                li.append(left[idx])
                del left[idx]
                l += 1
                le -= 1
            res.append(li)
        return res

