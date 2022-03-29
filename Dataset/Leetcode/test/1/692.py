 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, val in enumerate(nums):
            complement = target - val
            if complement in d.keys():
                return [d[complement], i]
            d[val] = i

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


