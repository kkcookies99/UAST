 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # if len(nums)==1:
        #     return nums[0]
        # a = nums[0]
        # for i in range(1,len(nums)):
        #     a= a^nums[i]
        # return a
        # 去重，求和，做差
        return sum(set(nums))*2-sum(nums)

