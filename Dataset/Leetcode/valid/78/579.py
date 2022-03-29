 class Solution(object):
    def XXX(self, nums):
        res = [[]]
        for i in range(len(nums)-1, -1, -1):
            res = res + [[nums[i]]+s for s in res]
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


