 class Solution:
    def XXX(self, nums: List[int]) -> int:
        fast = 1
        slow = 0
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return 1
        else:
            while (fast < len(nums)):
                if nums[fast] == nums[fast -1]:
                    pass
                else:
                    slow += 1
                    nums[slow] = nums[fast]
                fast+=1
        return slow+1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


