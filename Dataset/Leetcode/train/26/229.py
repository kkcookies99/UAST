 class Solution:
    def XXX(self, nums: List[int]) -> int:
        l = len(nums)
        count = 0
        if l > 0:
            temp = nums[0]
            for i in range(1,l,1):
                if temp != nums[i]:
                    count = count + 1
                    temp = nums[i]
                    nums[count] = nums[i]
            return count + 1
        else:
            return count

