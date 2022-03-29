# 删除有序数组中的重复项II 每个元素最多出现两次
class Solution:
    def XXX(self, nums: List[int]) -> int:
        n = len(nums)
        if (n <= 2) :
            return n
        
        slow, fast = 2, 2 # 数组的前两个数必然可以被保留
        while (fast < n) :
            # 检查上上个应该被保留的元素nums[slow−2]是否和当前待检查元素nums[fast]相同
            if nums[slow - 2] != nums[fast] :
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        
        return slow # 从nums[0]到nums[slow−1]的每个元素都不相同