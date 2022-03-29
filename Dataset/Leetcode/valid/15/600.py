 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) <= 2:
            return []
        nums.sort()
        prev = None
        result = []
        for i in range(0, len(nums)-2):
            curNum = nums[i]
            if curNum == prev:
                continue
            prev = curNum
            target = -curNum
            left, right = i+1, len(nums)-1
            while left < right:
                leftNum, rightNum = nums[left], nums[right]
                if leftNum + rightNum == target:
                    result.append([curNum, leftNum, rightNum])
                    while left < right and nums[left] == leftNum:
                        left += 1
                    while right > left and nums[right] == rightNum:
                        right -= 1
                elif leftNum + rightNum < target:
                    while left < right and nums[left] == leftNum:
                        left += 1
                else:
                    while right > left and nums[right] == rightNum:
                        right -= 1
        return result

