 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            try:
                temp = nums.pop()
                nums.remove(temp)
            except:
                return(temp)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


