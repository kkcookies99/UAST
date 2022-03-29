 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, n in enumerate(nums):
            j = d.get(n, -1)
            if j != -1:
                return [j, i]
            d[target - n] = i

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


