 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = list()
        n = len(nums)

        for i in range(n):
            if i>0 and nums[i]==nums[i-1]:
                continue
            
            target = -nums[i]
            pointer = n-1

            for j in range(i+1,n):
                if j>i+1 and nums[j]==nums[j-1]:
                    continue
                
                while j<pointer and nums[j]+nums[pointer]>target:
                    pointer-=1
                
                if j==pointer:
                    break
                if nums[j] + nums[pointer] == target:
                    ans.append([nums[i],nums[j], nums[pointer]])
        return ans


