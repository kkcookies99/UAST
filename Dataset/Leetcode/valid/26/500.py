 class Solution:
    def XXX(self, nums: [int]) -> int:
        nums[:] = sorted(list(set(nums)))  # 由于set()函数筛选过之后，不能操作。再转化为list进行排序。
        return len(nums)

