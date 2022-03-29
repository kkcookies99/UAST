 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        if n < 3:
            return []
        nums.sort()
        re = list()
        for mid in range(1, n-1):
            left = 0
            right = n-1
            b = nums[mid]
            while left < mid and right > mid:
                a = nums[left]
                c = nums[right]
                if a > 0 or c < 0:
                    break
                if -a - c > b:
                    left += 1
                elif -a-c < b:
                    right -= 1
                else:
                    if [a,b,c] not in re:
                        re.append([a, b, c])
                    left += 1
                    right -= 1

        return re

