class Solution:
    def XXX(self, nums: List[int]) -> None:
        rgb = [0, 0, 0]
        for i in nums:
            rgb[i] += 1
        nums[:rgb[0]] = [0 for _ in range(rgb[0])]
        nums[rgb[0]:rgb[0] + rgb[1]] = [1 for _ in range(rgb[1])]
        nums[rgb[0] + rgb[1]:] = [2 for _ in range(rgb[2])]

