 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        a = nums.count(0)
        b = nums.count(1)
        c = nums.count(2)
        for i in range(len(nums)):
            if i <= a-1:
                nums[i] = 0
            elif i <= a+b-1:
                nums[i] = 1
            else:
                nums[i] = 2
        return nums

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


