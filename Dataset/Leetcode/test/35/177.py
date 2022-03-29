 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        ans = len(nums)
        while(left<=right):
            mid = (right + left) >> 1
            if(target<=nums[mid]):
                right = mid-1
                ans = mid
            else:
                left = mid+1
        return ans

