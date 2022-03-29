 class Solution(object):

    def XXX(self, nums):
        result = []

        def backtrack(path):
            if len(path) == len(nums):  # path长度与nums相等时, 输出
                result.append(path)
                return
            for num in set(nums) - set(path):  # 遍历所有可以增加的元素(排除掉已经在path里面的)
                backtrack(path+[num])
        
        backtrack([])  # 从空集开始增加元素
        return result


