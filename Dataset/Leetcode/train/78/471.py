 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[[]]
        for i in range(1, len(nums)+1):
            iter1 = itertools.combinations(nums, i)
            res=res+list(iter1)
        return res
        


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


