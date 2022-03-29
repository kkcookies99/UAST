 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums = sorted(nums)
        if len(nums) < 3:
            return res
        for i in range(0, len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                continue
            j = i + 1
            k = len(nums) - 1
            while j < k:
                target = nums[i] + nums[j] + nums[k]
                if target > 0:
                    k -= 1
                elif target < 0:
                    j += 1
                else:
                    res.append([nums[i], nums[j], nums[k]])
                    while j < k and nums[j] == nums[j+1]:
                        j += 1
                    while j < k and nums[k] == nums[k-1]:
                        k -= 1
                    j += 1
                    k -= 1
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


