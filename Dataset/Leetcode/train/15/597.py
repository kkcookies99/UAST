 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        ans = list()
        for first in range(n):
            # 如果枚举的元素和前一个相同，直接跳过
            if first > 0 and nums[first] == nums[first-1]:
                continue
            # first, second, third 分别对应变量a,b,c
            third = n - 1
            for second in range(first+1, n-1):
                # 同样，如果与前一个元素相同，直接跳过
                if second > (first+1) and nums[second] == nums[second-1]:
                    continue
                while second < third and nums[first] + nums[second] + nums[third] > 0:
                    third -= 1
                # 指针重合了，说明没找到
                if second == third:
                    break
                if nums[first] + nums[second] + nums[third] == 0:
                    ans.append([nums[first],nums[second],nums[third]])
        return ans      

