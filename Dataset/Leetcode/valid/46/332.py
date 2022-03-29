class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums)==1:
            return [nums[:]]
        for i in range(len(nums)):
            num = nums.pop(0)
            # 对剩下的元素找可能的排列
            perms = self.XXX(nums)
            for perm in perms:
                # 每个可能的排列前面都加上num
                perm.insert(0,num)
            # 放到result里
            result.extend(perms)
            # 重要：把开始时pop掉的num放回nums的末尾
            nums.append(num)
        return result


