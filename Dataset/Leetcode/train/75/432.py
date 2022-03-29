 class Solution:
    def XXX(self, nums: List[int]) -> None:
        zero = -1    # 保持[:zero]的元素是0
        two = len(nums)   # 保持[two:]的元素是2
        i = 0
        while i < two:
            n = nums[i]
            if n == 0:
                zero += 1
                nums[zero], nums[i] = nums[i], nums[zero]
                i += 1
            elif n == 2:
                two -= 1
                nums[i], nums[two] = nums[two], nums[i]
            else:
                i += 1

