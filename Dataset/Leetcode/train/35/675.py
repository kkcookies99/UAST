 class Solution:
    """
    9:07 9:16 
    first time:9 min
    total time:9min 
    time complexity:O(n)
    space complexity:O(1)
    idea:将目标索引默认为nums长度，设置一个标记索引为插入的位置，迭代nums。
    """
    def XXX(self, nums: List[int], target: int) -> int:
        index=len(nums)
        mark=0
        for i in range(len(nums)):
            if target==nums[i]:
                index=i
                break
            elif mark==0 and target<nums[i]:
                index=i
                mark=1
        return index
        




