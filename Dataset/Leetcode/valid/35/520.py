 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        n = len(nums)
        start = 0
        end = n - 1
        while start <= end:
            mid = (start + end) // 2
            if target == nums[mid]:
                return mid
            elif target > nums[mid]:
                start = mid + 1
            else:
                end = mid - 1
        return start


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


