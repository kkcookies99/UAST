 class Solution:
    def __init__(self):
        self.result = []

    def XXX(self, nums):
        return self.helper(nums, 0, [])

    def helper(self, nums, index, temp):
        if index == len(nums):
            self.result.append(temp)
            return
        self.result.append(temp)
        for i in range(index, len(nums)):
            self.helper(nums, i + 1, temp + [nums[i]])
        return self.result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


