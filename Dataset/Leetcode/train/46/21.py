class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []  #存放符合条件结果的集合
        path = []  #用来存放符合条件的结果
        used = []  #用来存放已经用过的数字
        def backtrack(nums,used):
            if len(path) == len(nums):
                return res.append(path[:])  #此时说明找到了一组
            for i in range(0,len(nums)):
                if nums[i] in used:
                    continue  #used里已经收录的元素，直接跳过
                path.append(nums[i])
                used.append(nums[i])
                backtrack(nums,used)
                used.pop()
                path.pop()
        backtrack(nums,used)
        return res

