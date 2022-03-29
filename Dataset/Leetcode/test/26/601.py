 def XXX(self, nums: List[int]) -> int:
        slow = 0
        for fast in range(1, len(nums)):
            if nums[slow] != nums[fast]:
                nums[slow + 1] = nums[fast]
                slow += 1
        nums = nums[:slow+1]
        return slow+1

