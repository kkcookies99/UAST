 class Solution:
    def XXX(self, nums: List[int]) -> int:
        length = len(nums)
        if length <= 1:
            return nums[0]
        for i in range(1, length):
            sum_ = nums[i-1] + nums[i]
            if sum_ > nums[i]:
                nums[i] = sum_
        return max(nums)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


