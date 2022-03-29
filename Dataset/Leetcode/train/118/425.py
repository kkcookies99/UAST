 class Solution:
     def XXX(self, numRows: int) -> List[List[int]]:
        if numRows is 0: return []
        if numRows is 1: return [[1]]
        if numRows is 2: return [[1], [1, 1]]
        nums, i = [[1], [1, 1]], 2
        for i in range(1,numRows-1):
            ln = [1]
            for j in range(len(nums)-1):
                ln.append(nums[i][j] + nums[i][j+1])
            ln.append(1)
            nums.append(ln)
        return nums


