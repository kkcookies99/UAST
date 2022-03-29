 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if len(nums) == 0:      #如果nums为空，则应插入第一个位置
            return 0
        for i in range(len(nums)):
            if (nums[i] > target)or(nums[i] == target): #如果等于target后者当前访问的元素大于target，则返回该位置
                return i
        return len(nums)    #查找完毕则插入到最后

