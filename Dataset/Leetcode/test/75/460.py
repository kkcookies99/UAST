 class Solution:
    def XXX(self, nums: List[int]) -> None:
        if not nums:
            return
        zero_idx = 0
        two_idx = len(nums) - 1
        i = 0
        while i < len(nums):
            #  知道答案为什么错了吧
            #  因为下面会有重复计算了 而且还可能有0 2 互换的情况
            if nums[i] == 0:
                # 下面可能是会满足 i> zero_idx
                self.swap(nums, i, zero_idx)
                zero_idx += 1
            elif two_idx > i and nums[i] == 2:
                while two_idx >= 0 and nums[two_idx] == 2:
                    two_idx -= 1
                if two_idx <= i:
                    continue
                self.swap(nums, i, two_idx)
                if nums[i] == 0:
                    i -= 1
                two_idx -= 1
            i += 1
        print(nums)

    def swap(self, nums: List[int], start: int, end: int):
        nums[start], nums[end] = nums[end], nums[start]


