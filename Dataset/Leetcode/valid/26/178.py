 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # 直接pop法
        # if len(nums)<=1: return len(nums)
        # curr = nums[0]
        # idx = 1
        # while idx < len(nums):
        #     # print(nums[idx], curr)
        #     if nums[idx] != curr:
        #         curr = nums[idx]
        #         idx += 1
        #         if idx >= len(nums): break
                
        #     else:
        #         nums.pop(idx)
        # return len(nums)

        # 复制法
        if len(nums)<=1: return len(nums)
        left, right = 0, 1
        while right < len(nums):
            if nums[left] == nums[right]:
                right += 1
            else:
                left += 1
                nums[left] = nums[right]
                right += 1
        return left+1

