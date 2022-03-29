 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        #已经存在 直接返回索引
        if target in nums:
            return nums.index(target)
        else:
            #比最小的小 插入第一个
            if nums[0] > target:
                return 0
            #比最大的大 插入最后一个
            if nums[-1] < target:
                return len(nums)
            #二分查找
            p = 0
            q = len(nums)-1
            while p <= q:
                m = (p+q)/2
                if nums[m] > target:
                    q = m-1
                elif nums[m] < target:
                    p = m+1
            return p

