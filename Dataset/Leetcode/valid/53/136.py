class Solution:
    def XXX(self, nums: List[int]) -> int:
        #dp 思想
        # rs = -999999999999
        # curSum = 0
        # for num in nums:
        #     curSum = max(curSum + num, num)
        #     rs = max(rs, curSum)
        # return rs
        
        # 分治思想

        def Merge(nums, left, right):
            if (left >= right):
                return nums[left]
            mid = (left + right) // 2
            lmax = Merge(nums, left, mid)
            rmax = Merge(nums, mid + 1, right)
            ## 记录前半段中以nums[mid]为结尾的最大和，L1
            L1 = -999999
            t = 0
            for i in range(mid, left-1, -1):
                t += nums[i]
                L1 = max(L1, t)
            ## 记录后半段中以nums[mid+1]为开头的最大和, L2
            L2 = -999999
            t = 0
            for i in range(mid+1, right+1, 1):
                t += nums[i]
                L2 = max(L2, t)
            ## 最大值为lmax,rmax以及上述L1+L2的最大和
            return max((L1+L2), lmax, rmax)
        return Merge(nums, 0, len(nums) - 1)