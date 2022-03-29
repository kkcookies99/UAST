 class Solution:
    """
    第一次用时：63min
    总用时:88min
    时间复杂度：O(n)
    空间复杂度：O(n)
    思路：将子序列和分别与max、0比较，小于0当做0对待。
    """
    def XXX(self, nums: List[int]) -> int:
        my_max=nums[0]
        subArraySum=nums[0]
        if subArraySum<0:
            subArraySum=0
        for i in range(1,len(nums)):
            subArraySum+=nums[i]
            if(subArraySum>my_max):
               my_max=subArraySum
            if(subArraySum<0):
                subArraySum=0
        return my_max

