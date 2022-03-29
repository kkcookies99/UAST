 class Solution:
    """
    first time:27 min
    total time:27 min
    time complexity:O(n^2)
    space complexity:O(n^2)
    idea:每层列表中除首尾之外的元素elemArray[i]等于上一层列表的elemArray[i-1]+elemArray[i]
    """
    def XXX(self, numRows: int) -> List[List[int]]:
        nestArray=[0]*numRows
        for i in range(numRows):
            elemArray=[1]*(i+1)
            for j in range(1,i):
                elemArray[j]=nestArray[i-1][j-1]+nestArray[i-1][j]
            nestArray[i]=elemArray
        return nestArray


