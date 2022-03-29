 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        for index,num in enumerate(nums):
            if num == 0 and index != n-1:
                pat_step = 0
                while nums[index] <= pat_step:
                    if index == 0:
                        return False
                    index -= 1
                    pat_step += 1
        return True

