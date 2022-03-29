 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # # 1. online-processing T=O(n), S=O(1)
        # maxSum = float("-inf")
        # runningSum = 0
        # for i in range(0, len(nums)):
        #     runningSum += nums[i]
        #     maxSum = max(maxSum, runningSum)
        #     if runningSum < 0:
        #         runningSum = 0
        # return maxSum

        # # 2.1 dynamic programming T=O(n), S=O(n)
        # # dp[i]: 以i为结尾的最大的maxSum
        # dp = nums[:]
        # for i in range(1, len(nums)):
        #     dp[i] = max(dp[i-1]+nums[i], dp[i])
        # return max(dp)

        # # 2.2 dynamic programming T=O(n), S=O(1)
        # pre = nums[0]
        # maxSum = nums[0]
        # for i in range(1, len(nums)):
        #     pre = max(pre+nums[i], nums[i])
        #     maxSum = max(maxSum, pre)
        # return maxSum

        # 3. divide and conquer T=O(n), S=O(lgn)
        # a: [lo, hi]中始于lo的最大和
        # m: [lo, hi]中区间的最大和
        # b: [lo, hi]中始于hi的最大和
        # s: [lo, hi]中区间和
        def div_n_conq(lo, hi):
            if lo == hi:
                return nums[lo], nums[lo], nums[lo], nums[lo]
            mi = (lo + hi)//2
            a1, b1, m1, s1 = div_n_conq(lo, mi)
            a2, b2, m2, s2 = div_n_conq(mi+1, hi)
            a = max(a1, s1+a2)
            b = max(b2, s2+b1)
            m = max(m1, m2, b1+a2)
            s = s1 + s2
            return a, b, m, s

        if not nums: return -999999
        _, _, m, _ = div_n_conq(0, len(nums)-1)
        return m

