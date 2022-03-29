 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        res = []
        for i in nums:
            tmp = nums[:]
            tmp.remove(i)
            if target - i in tmp:
                res.append(nums.index(i))
                res.append(tmp.index(target - i) + 1)
                break
        return res
        

