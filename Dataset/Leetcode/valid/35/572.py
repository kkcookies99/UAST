 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums) - 1
        while (end - start) > 1:
            temp = (start + end) // 2
            if target > nums[temp]:
                start = temp + 1
            elif target < nums[temp]:
                end = temp
            else:
                return temp
        if target <= nums[start]:
            return start
        elif target <= nums[end]:
            return end
        else:
            return end + 1
        

