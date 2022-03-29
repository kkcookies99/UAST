 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        result = 0
        for i in range(len(nums)):
            if target in nums:
                return nums.index(target)
            else:
                nums.append(target)
                nums = sorted(nums)
                return nums.index(target)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


