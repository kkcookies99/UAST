 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return True
        i = 0
        can = False
        while True:
            try:
                i = nums.index(0, i, len(nums))  # 0的下标 
                for x in range(i):
                    if nums[i - x - 1] < x + 1 + 1 < len(nums):  # 不能跳过0切不是跳到最后
                        can = False
                        continue
                    else:
                        can = True
                        break
                if not can:
                    break
                i+=1
            except ValueError:
                can = True
                break
        return can

