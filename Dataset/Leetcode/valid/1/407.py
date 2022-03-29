 class Solution:

    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for index, value in enumerate(nums):
            diff = target - value
            nums.pop(index)
            if diff in nums:
                return [index, nums.index(diff) + 1]
            nums.insert(index, value)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


