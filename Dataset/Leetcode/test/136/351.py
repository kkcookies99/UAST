 class Solution(object):
    def singleNumber(self, nums):
        #两个相同的数异或是0
        #0和任何数异或是本身
        res = 0
        for num in nums:
            res = res ^ num
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


