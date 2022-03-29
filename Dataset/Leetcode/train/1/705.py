 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for index, num in enumerate(nums):
            tmp = target-num
            if tmp in nums:
                if nums.index(tmp)!=index:
                    return [index, nums.index(tmp)]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


