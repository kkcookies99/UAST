class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        cnt = [0] * 3
        for x in nums:
            cnt[x] += 1
        for i in range(2):
            cnt[i + 1] += cnt[i]

        nums[:cnt[0]] = [0] * cnt[0]
        nums[cnt[0]:cnt[1]] = [1] * (cnt[1] - cnt[0])
        nums[cnt[1]:cnt[2]] = [2] * (cnt[2] - cnt[1])

