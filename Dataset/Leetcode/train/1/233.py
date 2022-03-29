 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            result = target - nums[i]
            if result in nums and nums.index(result) != i:
                return i,nums.index(result)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


