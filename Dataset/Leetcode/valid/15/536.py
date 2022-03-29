 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums)<3:
            return result
        # 对数组排序进行
        nums.sort()
        # 排除特殊情况，所有元素都为零
        if nums[0] == 0 and nums[-1]==0:
            return [[0,0,0]]
        for i in range(len(nums)):
            if nums[i]>0:
                return result
            # 跳过重复值
            if nums[i]==nums[i-1]:
                continue    
            L = i+1
            R = len(nums)-1
            while L<R:
                if nums[i]+nums[L]+nums[R]==0:
                    result.append([nums[i], nums[L], nums[R]])
                     # 跳过重复值
                    while L<R and nums[L]==nums[L+1]: L+=1
                    while L<R and nums[R]==nums[R-1]: R-=1
                    L+=1
                    R-=1
                elif nums[i]+nums[L]+nums[R]>0: R-=1
                else: L+=1
        return result
                    

