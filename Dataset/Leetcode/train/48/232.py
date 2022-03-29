class Solution:
    def XXX(self, nums: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m=len(nums)
        #这里先对1，2，3，6，9这个外圈换位置，然后对4，5，8换位置。
        for i in range(m):
            #这里是先将最外圈进行转换如 [1,2,3],转换为[9,6,3],
            #                         [4,5,6],     [4,5,2]
            #                         [7,8,9]      [7,8,1]
            for j in range(m-i-1):
                nums[i][j],nums[m-j-1][m-i-1]=nums[m-j-1][m-i-1],nums[i][j]
            #外圈转换后，我们可以看到最后一列我们还需要进行一个反转，即下面的for循环所做的工作
            #使最后一列的3，2，1变为1，2，3
            for j in range(m//2):
                nums[j][m-i-1],nums[m-j-1][m-i-1]=nums[m-j-1][m-i-1],nums[j][m-i-1]
        

