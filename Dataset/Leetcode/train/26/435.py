 class Solution:
    def XXX(self, nums: List[int]) -> int:
        flag = 0
        for num in nums:
            if nums[flag]!=num:
                flag +=1
                nums[flag] = num
        return flag+1
                

