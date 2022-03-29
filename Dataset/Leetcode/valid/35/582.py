 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        n = len(nums)
        left, right = 0, n
        while left < right:
            mid = (left + right) // 2
            if nums[mid] > target:
                right = mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                return mid
        return left

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


