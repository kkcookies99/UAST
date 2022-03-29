 def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        i = 0
        j = i + 1
        while j <= len(nums) - 1:
            if nums[i] != nums[j]:
                nums[i+1] = nums[j]
                i += 1
            j += 1
        return i + 1

