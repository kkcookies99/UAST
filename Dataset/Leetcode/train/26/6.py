 # 删除有序数组的重复项
class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        n = len(nums)
        fast = slow = 1 # 删除重复元素之后也至少剩下一个元素
        while fast < n:
            if nums[fast] != nums[fast - 1]: # 说明nums[fast] 和之前的元素都不同
                nums[slow] = nums[fast]      # nums[fast] 的值复制到 nums[slow]
                slow += 1
            fast += 1
        
        return slow # 从nums[0]到nums[slow−1]的每个元素都不相同
        

        
