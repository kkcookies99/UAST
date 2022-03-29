 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        if not nums:return 0
        slow = 0   
        n = len(nums)
        fast = n - 1
        while slow < fast:
            while slow < fast and nums[slow] != val:
                slow += 1
            while slow < fast and nums[fast] == val:
                fast -= 1
            nums[slow],nums[fast] = nums[fast],nums[slow]
            slow += 1
            fast -= 1
        res = 0
        #print(nums,slow,fast)
        #return fast + 1
        for i in range(n):
            if nums[i] == val:
                return res
            res += 1

