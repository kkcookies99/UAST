 class Solution:
    def XXX(self, nums: List[int]) -> int:
        flag = 0
        index = 0
        sum_inx = 0
        leng = len(nums)
        while flag + sum_inx < leng:
            while flag+index+1<leng and nums[flag]==nums[flag + index + 1]:
                index = index + 1
            nums[flag:leng - sum_inx - index] = nums[flag + index:leng - sum_inx]
            sum_inx = sum_inx + index
            flag = flag + 1
            index = 0
        return flag

