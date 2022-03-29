 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        res=[]
        if n<3:
            return res
        nums.sort()
        for i in range(n-2):
            if i>0 and nums[i]==nums[i-1]:#去重剪枝
                continue
            if nums[i]+sum(nums[i+1:i+3])>0:#如果固定数与剩下数组的最小的两个数都大于0，则后续循环就没必要了
                break
            if nums[i]+sum(nums[-1:-3:-1])<0:#如果固定数，与剩下数组的最大的两个数都小于0，则移动固定数，进入下一次遍历
                continue
            left,right=i+1,n-1#剩下的两个数采用双指针法
            while left<right:
                count=nums[i]+nums[left]+nums[right]
                if count<0:# 如果当前和小于0, 收缩左边界
                    left+=1
                elif count>0:# 如果当前和大于0, 收缩左边界
                    right-=1
                else:
                    res.append([nums[i],nums[left],nums[right]])
                    # 求得正确解后，去重（剪枝）
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    # 求得正确解后，去重（剪枝）
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    # 在求得正确解，并且剪枝后，仅收缩移动一个指针，都不会是正确解；
                    # 因此应收缩移动双指针，直接排除不符合解的情况，减少运算次数
                    left += 1
                    right -= 1
        return res

