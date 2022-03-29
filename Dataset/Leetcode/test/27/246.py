 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        while True:
            try:
                nums.remove(val)
            except:
                break
        return len(nums)

