 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        count = len(nums)
        collect = []
        for i in range(count):
            left = i+1
            right = count-1
            #避免重复找同一个数据
            if i >0 and nums[i] == nums[i-1]:
                left +=1
                continue
            #数据按小到大排列，每次选取nums[i]，在其后寻找符合a + b + c = 0的两个数据
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    col = [nums[i],nums[left],nums[right]]
                    collect.append(col)
                    left+=1
                    right-=1
                    #循环中nums[i]已确定，当再确定1个数时，另一个数也确定，左右端任一端出现重复均可跳过
                    while nums[left] == nums[left-1] and left < right:
                        left+=1
                    while nums[right] == nums[right+1] and left < right:
                        right-=1
                if sum<0:
                    left+=1
                elif sum > 0:
                    right-=1
        return collect          

