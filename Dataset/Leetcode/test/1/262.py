 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = list()
        d = dict()
        for i in range(len(nums)):
            # list中的数值作为键值key，index作为value
            # 字典的键值要是不可变的：如：str
            d[str(nums[i])] = i
        
        for j in range(len(nums)):
            complement = target - nums[j]
            if str(complement) in d and d.get(str(complement)) != j:
                result.append(j)
                result.append(d[str(complement)])
                return result

