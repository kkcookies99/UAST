 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        nums.append(0)
        for i in range(0,len(nums),2):
            if nums[i]!=nums[i+1]:
                return nums[i]
                break

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


