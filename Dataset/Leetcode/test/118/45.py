 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        nums = [ [0] * (i+1) for i in range(numRows)]
        for i in range(len(nums)):
            for j in range(len(nums[i])):
                if j == 0 or j == i:
                    nums[i][j] = 1
                else:
                    nums[i][j] = nums[i-1][j-1]+nums[i-1][j]
        return nums

