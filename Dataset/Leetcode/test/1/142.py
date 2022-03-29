 class Solution:
    # def XXX(self, nums: list[int], target: int) -> list[int]:
    #     """暴力遍历方法"""
    #     for i in range(len(nums)-1):
    #         for j in range(i+1,len(nums)):
    #             if(nums[i] + nums[j] == target):
    #                 return i,j
    #     return 0,0

    def XXX(self, nums: list[int], target: int) -> list[int]:
        # """hash遍历，提高性能"""
        sum_hash = {}
        for i in range(len(nums)):

            if(nums[i] in sum_hash):
                return [sum_hash[nums[i]],i]
            cha = target - nums[i]
            sum_hash[cha] = i
        return [0,0]


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


