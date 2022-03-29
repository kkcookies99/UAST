 class Solution:
    def XXX(self, nums):
        if len(nums) < 2:
            return nums

        n = len(nums)
        left = self.XXX(nums[:n//2])
        right = self.XXX(nums[n//2:])

        new_nums = list()
        i = j = 0
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                new_nums.append(left[i])
                i += 1
            else:
                new_nums.append(right[j])
                j += 1
        while i < len(left):
            new_nums.append(left[i])
            i += 1
        while j < len(right):
            new_nums.append(right[j])
            j += 1
        return new_nums

print(Solution().XXX([2,0,2,1,1,0]))

