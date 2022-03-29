 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[]
        for i in nums:
            # 每遇到一个元素
            for j in range(len(res)):
                # 就在现有子集元素的基础上加上该元素，组成新的子集
                res.append(res[j]+[i])
            res.append([i])
        # 最后补上一个空集
        res.append([])
        return res

