 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        a = len(nums)
        l = []
        for i in range(0,a-1):
            for j in range(i+1,a):
                if nums[i]+nums[j] == target:
                    l.append((i,j))
        return l

