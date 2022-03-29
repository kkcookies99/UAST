 class Solution:
    """双指针法
    时间复杂度：O(n)
    空间复杂度：O(1)
    """

    @classmethod
    def XXX(cls, nums: List[int], val: int) -> int:
        fast = slow = 0

        while fast < len(nums):

            if nums[fast] != val:
                nums[slow] = nums[fast]
                slow += 1

            # 当 fast 指针遇到要删除的元素时停止赋值
            # slow 指针停止移动, fast 指针继续前进
            fast += 1

        return slow

