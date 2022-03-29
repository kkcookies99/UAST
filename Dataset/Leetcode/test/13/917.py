 class Solution:
    def XXX(self, s: str) -> int:
        mapping = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000,
        }
        nums = [mapping[i] for i in s]
        index, ans = 0, 0
        while index < len(nums):
            if index==len(nums)-1:
                ans += nums[index]
                return ans
            elif nums[index] >= nums[index+1]:
                ans += nums[index]
                index += 1
            else:
                ans += nums[index+1] - nums[index]
                index += 2
        return ans

