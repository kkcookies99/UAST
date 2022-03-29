 class Solution:

    def XXX(self, nums, target):
        temp = {}
        for index, value in enumerate(nums):
            diff = target - nums[index]
            if temp.get(diff, False):
                return [int(temp.get(diff)), index]
            temp[nums[index]] = str(index)


            
s = Solution()
s.XXX([2, 7, 11, 15], 9)
                

