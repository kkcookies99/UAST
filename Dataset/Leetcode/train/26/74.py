 class Solution:
    def XXX(self, nums: List[int]) -> int:
        n = len(nums)
        count = 0
        max_num = nums[n-1]  ## 提示这里出问题

        for i in range(n):
            if(nums[i] == max_num+1):
                continue
            for j in range(i+1,n):
                if (nums[i] == nums[j]):
                    nums[j] = max_num + 1
                    count += 1

        nums.sort()
        for i in range(count):
            nums.pop(n-i-1)
        result = len(nums)

        return result

