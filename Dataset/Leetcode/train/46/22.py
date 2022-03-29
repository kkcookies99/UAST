class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []  #存放符合条件结果的集合
        path = []  #用来存放符合条件的结果
        def backtrack(nums):
            if len(path) == len(nums):
                return res.append(path[:])  #此时说明找到了一组
            for i in range(0,len(nums)):
                if nums[i] in path:  #path里已经收录的元素，直接跳过
                    continue
                path.append(nums[i])
                backtrack(nums)  #递归
                path.pop()  #回溯
        backtrack(nums)
        return res

