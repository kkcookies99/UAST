# 通解扩展
class Solution:
    def XXX(self, nums: List[int]) -> int:
        def solve(k): # 最多保留k位相同数字
            slow = 0 # 慢指针从0开始
            for fast in nums: # 快指针遍历整个数组
                # 检查被保留的元素nums[slow−k]是否和当前待检查元素fast相同
                if slow < k or nums[slow - k] != fast:
                    nums[slow] = fast
                    slow += 1
            return slow # 从nums[0]到nums[slow−1]的每个元素都不相同
        return solve(2)

