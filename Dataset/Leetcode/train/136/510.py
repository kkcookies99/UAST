 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        from operator import xor
        from functools import reduce
        return reduce(xor, nums)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


