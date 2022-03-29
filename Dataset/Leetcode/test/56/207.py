 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        n = len(intervals)
        if n == 0 or n == 1:
            return intervals
        
        def findPos(nums, left,right):
            temp = nums[left]
            mid = nums[left][0]
            while left<right:
                # 从右向左
                while left < right and  nums[right][0] >= mid:
                    right -= 1
                nums[left] = nums[right]
                # 从左向右
                while left < right and nums[left][0] <= mid: 
                    left += 1
                nums[right] = nums[left]
            # 初始的值
            nums[left] = temp
            return left

        def QuickSort(nums,left,right):
            if left < right:
                loc = findPos(nums,left,right)
                QuickSort(nums,left,loc-1)
                QuickSort(nums,loc+1,right)

        # 快速排序
        QuickSort(intervals, 0, n-1)
        # 开始覆盖
        result = []
        i = 0
        while i < n: 
            start = i
            # 注意这里有一个max_1,因为[i+1][1]不一定就比前一个大，取最大值
            max_1 = intervals[i][1]
            while i < n-1 and intervals[i+1][0] <= max_1:
                i += 1
                max_1 = max(max_1, intervals[i][1])
            result.append([intervals[start][0],max_1])
            i += 1
        return result

