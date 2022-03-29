 class Solution:
    def XXX(self, nums: List[int]) -> None:
        left = 0
        size = len(nums)
        right = size-1
        cur = 0
        while cur<=right:
            if nums[cur]==0:
                nums[left],nums[cur] = nums[cur],nums[left]
                left+=1
                cur+=1
            elif nums[cur]==1:
                cur+=1
            else:
                nums[right],nums[cur]=nums[cur],nums[right]
                right-=1

