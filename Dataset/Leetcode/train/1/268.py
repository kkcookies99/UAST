 class Solution(object):
    def XXX(self, nums, target):
        lenght = len(nums)
        for i in range(0, lenght):
            for r in range(i + 1, lenght):
                if target - nums[i] == nums[r]:
                    return[i, r]
                    break

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


