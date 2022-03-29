 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        for i in range(len(nums)):
            if nums[i] == target:
                return i
        left = 0
        right = len(nums)-1
        if len(nums) == 1:
            if nums[0] > target:
                return 0
            else:
                return 1
        else:
            while(left < right):
                mid = (left + right) // 2
                if nums[mid] > target:
                    right = mid
                else:
                    left = mid + 1
            if left == len(nums)-1 and nums[left] < target:
                return left + 1
            else:
                return left
        
s = Solution()
print(s.XXX([1,3],2))
print(s.XXX([1,3,5,6],7))

